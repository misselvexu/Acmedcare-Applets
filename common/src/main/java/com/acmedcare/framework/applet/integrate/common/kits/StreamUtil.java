package com.acmedcare.framework.applet.integrate.common.kits;

import com.acmedcare.framework.applet.integrate.common.Constants;

import java.io.*;

import static com.acmedcare.framework.applet.integrate.common.Constants.ioBufferSize;

/** Optimized byte and character stream utilities. */
public class StreamUtil {

  // ---------------------------------------------------------------- silent close

  /**
   * Closes silently the closable object. If it is <code>FLushable</code>, it will be flushed first.
   * No exception will be thrown if an I/O error occurs.
   */
  public static void close(Closeable closeable) {
    if (closeable != null) {
      if (closeable instanceof Flushable) {
        try {
          ((Flushable) closeable).flush();
        } catch (IOException ignored) {
        }
      }

      try {
        closeable.close();
      } catch (IOException ignored) {
      }
    }
  }

  // ---------------------------------------------------------------- copy

  /**
   * Copies input stream to output stream using buffer. Streams don't have to be wrapped to
   * buffered, since copying is already optimized.
   */
  public static int copy(InputStream input, OutputStream output) throws IOException {
    byte[] buffer = new byte[ioBufferSize];
    int count = 0;
    int read;
    while (true) {
      read = input.read(buffer, 0, ioBufferSize);
      if (read == -1) {
        break;
      }
      output.write(buffer, 0, read);
      count += read;
    }
    return count;
  }
  /** Copies specified number of bytes from input stream to output stream using buffer. */
  public static int copy(InputStream input, OutputStream output, int byteCount) throws IOException {
    int bufferSize = (byteCount > ioBufferSize) ? ioBufferSize : byteCount;

    byte[] buffer = new byte[bufferSize];
    int count = 0;
    int read;
    while (byteCount > 0) {
      if (byteCount < bufferSize) {
        read = input.read(buffer, 0, byteCount);
      } else {
        read = input.read(buffer, 0, bufferSize);
      }
      if (read == -1) {
        break;
      }
      byteCount -= read;
      count += read;
      output.write(buffer, 0, read);
    }
    return count;
  }

  /** Copies input stream to writer using buffer. */
  public static void copy(InputStream input, Writer output) throws IOException {
    copy(input, output, Constants.encoding);
  }
  /** Copies specified number of bytes from input stream to writer using buffer. */
  public static void copy(InputStream input, Writer output, int byteCount) throws IOException {
    copy(input, output, Constants.encoding, byteCount);
  }
  /** Copies input stream to writer using buffer and specified encoding. */
  public static void copy(InputStream input, Writer output, String encoding) throws IOException {
    copy(new InputStreamReader(input, encoding), output);
  }
  /**
   * Copies specified number of bytes from input stream to writer using buffer and specified
   * encoding.
   */
  public static void copy(InputStream input, Writer output, String encoding, int byteCount)
      throws IOException {
    copy(new InputStreamReader(input, encoding), output, byteCount);
  }

  /**
   * Copies reader to writer using buffer. Streams don't have to be wrapped to buffered, since
   * copying is already optimized.
   */
  public static int copy(Reader input, Writer output) throws IOException {
    char[] buffer = new char[ioBufferSize];
    int count = 0;
    int read;
    while ((read = input.read(buffer, 0, ioBufferSize)) >= 0) {
      output.write(buffer, 0, read);
      count += read;
    }
    output.flush();
    return count;
  }
  /** Copies specified number of characters from reader to writer using buffer. */
  public static int copy(Reader input, Writer output, int charCount) throws IOException {
    int bufferSize = (charCount > ioBufferSize) ? ioBufferSize : charCount;

    char[] buffer = new char[bufferSize];
    int count = 0;
    int read;
    while (charCount > 0) {
      if (charCount < bufferSize) {
        read = input.read(buffer, 0, charCount);
      } else {
        read = input.read(buffer, 0, bufferSize);
      }
      if (read == -1) {
        break;
      }
      charCount -= read;
      count += read;
      output.write(buffer, 0, read);
    }
    return count;
  }

  /** Copies reader to output stream using buffer. */
  public static void copy(Reader input, OutputStream output) throws IOException {
    copy(input, output, Constants.encoding);
  }
  /** Copies specified number of characters from reader to output stream using buffer. */
  public static void copy(Reader input, OutputStream output, int charCount) throws IOException {
    copy(input, output, Constants.encoding, charCount);
  }
  /** Copies reader to output stream using buffer and specified encoding. */
  public static void copy(Reader input, OutputStream output, String encoding) throws IOException {
    Writer out = new OutputStreamWriter(output, encoding);
    copy(input, out);
    out.flush();
  }
  /**
   * Copies specified number of characters from reader to output stream using buffer and specified
   * encoding.
   */
  public static void copy(Reader input, OutputStream output, String encoding, int charCount)
      throws IOException {
    Writer out = new OutputStreamWriter(output, encoding);
    copy(input, out, charCount);
    out.flush();
  }

  // ---------------------------------------------------------------- compare content

  /**
   * Compares the content of two byte streams.
   *
   * @return <code>true</code> if the content of the first stream is equal to the content of the
   *     second stream.
   */
  public static boolean compare(InputStream input1, InputStream input2) throws IOException {
    if (!(input1 instanceof BufferedInputStream)) {
      input1 = new BufferedInputStream(input1);
    }
    if (!(input2 instanceof BufferedInputStream)) {
      input2 = new BufferedInputStream(input2);
    }
    int ch = input1.read();
    while (ch != -1) {
      int ch2 = input2.read();
      if (ch != ch2) {
        return false;
      }
      ch = input1.read();
    }
    int ch2 = input2.read();
    return (ch2 == -1);
  }
  /**
   * Compares the content of two character streams.
   *
   * @return <code>true</code> if the content of the first stream is equal to the content of the
   *     second stream.
   */
  public static boolean compare(Reader input1, Reader input2) throws IOException {
    if (!(input1 instanceof BufferedReader)) {
      input1 = new BufferedReader(input1);
    }
    if (!(input2 instanceof BufferedReader)) {
      input2 = new BufferedReader(input2);
    }

    int ch = input1.read();
    while (ch != -1) {
      int ch2 = input2.read();
      if (ch != ch2) {
        return false;
      }
      ch = input1.read();
    }
    int ch2 = input2.read();
    return (ch2 == -1);
  }
}
