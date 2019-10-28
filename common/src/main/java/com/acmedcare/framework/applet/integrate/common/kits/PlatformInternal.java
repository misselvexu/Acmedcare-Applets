package com.acmedcare.framework.applet.integrate.common.kits;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * Simplified netty class. Thanx: Stephane Landelle!
 *
 * @see
 *     <p>https://github.com/netty/netty/blob/master/common/src/main/java/io/netty/util/internal/PlatformDependent.java
 */
final class PlatformInternal {

  private static final Unsafe UNSAFE;

  private PlatformInternal() {}

  static {
    ByteBuffer direct = ByteBuffer.allocateDirect(1);
    Field addressField;
    try {
      addressField = Buffer.class.getDeclaredField("address");
      addressField.setAccessible(true);
      if (addressField.getLong(ByteBuffer.allocate(1)) != 0) {
        // A heap buffer must have 0 address.
        addressField = null;
      } else {
        if (addressField.getLong(direct) == 0) {
          // A direct buffer must have non-zero address.
          addressField = null;
        }
      }
    } catch (Throwable t) {
      // Failed to access the address field.
      addressField = null;
    }

    Unsafe unsafe;
    if (addressField != null) {
      try {
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        unsafe = (Unsafe) unsafeField.get(null);
      } catch (Throwable cause) {
        // Unsafe.copyMemory(Object, long, Object, long, long) unavailable.
        unsafe = null;
      }
    } else {
      // If we cannot access the address of a direct buffer, there's no point of using unsafe.
      // Let's just pretend unsafe is unavailable for overall simplicity.
      unsafe = null;
    }

    UNSAFE = unsafe;
  }

  static boolean hasUnsafe() {
    return UNSAFE != null;
  }

  // ---------------------------------------------------------------- string

  private static final long STRING_VALUE_FIELD_OFFSET;
  private static final long STRING_OFFSET_FIELD_OFFSET;
  private static final long STRING_COUNT_FIELD_OFFSET;

  static {
    long stringValueFieldOffset = -1L;
    long stringOffsetFieldOffset = -1L;
    long stringCountFieldOffset = -1L;

    if (UNSAFE != null) {
      try {
        // this should be:
        stringValueFieldOffset = UNSAFE.objectFieldOffset(String.class.getDeclaredField("value"));
        // try also:
        stringOffsetFieldOffset = UNSAFE.objectFieldOffset(String.class.getDeclaredField("offset"));
        stringCountFieldOffset = UNSAFE.objectFieldOffset(String.class.getDeclaredField("count"));
      } catch (Throwable ignore) {
      }
    }

    STRING_VALUE_FIELD_OFFSET = stringValueFieldOffset;
    STRING_OFFSET_FIELD_OFFSET = stringOffsetFieldOffset;
    STRING_COUNT_FIELD_OFFSET = stringCountFieldOffset;
  }

  /**
   * Returns String characters in most performing way. If possible, the inner <code>char[]</code>
   * will be returned. If not, <code>toCharArray()</code> will be called. Returns <code>null</code>
   * when argument is <code>null</code>.
   */
  static char[] unsafeGetChars(String string) {
    char[] value = (char[]) UNSAFE.getObject(string, STRING_VALUE_FIELD_OFFSET);

    if (STRING_OFFSET_FIELD_OFFSET != -1) {
      // old String version with offset and count
      int offset = UNSAFE.getInt(string, STRING_OFFSET_FIELD_OFFSET);
      int count = UNSAFE.getInt(string, STRING_COUNT_FIELD_OFFSET);

      if (offset == 0 && count == value.length) {
        // no need to copy
        return value;

      } else {
        char[] result = new char[count];
        System.arraycopy(value, offset, result, 0, count);
        return result;
      }

    } else {
      return value;
    }
  }

  static String unsafeCreateString(char[] chars) {
    String mutable = new String();

    UNSAFE.putObject(mutable, STRING_VALUE_FIELD_OFFSET, chars);

    if (STRING_COUNT_FIELD_OFFSET != -1) {
      UNSAFE.putInt(mutable, STRING_COUNT_FIELD_OFFSET, chars.length);
    }

    return mutable;
  }
}
