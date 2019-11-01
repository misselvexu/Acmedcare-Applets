package com.acmedcare.framework.applet.integrate.common.kits;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * {@link FileNameUtilTest}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
public class FileNameUtilTest {

  @Test
  public void newFileName() {
    for (int i = 0; i < 1000; i++) {
      System.out.println(FileNameUtil.newFileName("jpg"));
    }
  }
}