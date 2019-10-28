package com.acmedcare.framework.applet.integrate.common;

import com.acmedcare.framework.applet.integrate.common.kits.StringPool;

/**
 * Jodd CORE module.
 * Contains some global defaults.
 */
public class Constants {

	/**
	 * Default temp file prefix.
	 */
	public static String tempFilePrefix = "jodd-";

	/**
	 * Default file encoding (UTF8).
	 */
	public static String encoding = StringPool.UTF_8;

	/**
	 * Default IO buffer size (16 KB).
	 */
	public static int ioBufferSize = 16384;

}