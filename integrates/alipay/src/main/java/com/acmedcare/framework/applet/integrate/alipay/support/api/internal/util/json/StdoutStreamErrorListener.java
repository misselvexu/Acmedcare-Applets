package com.acmedcare.framework.applet.integrate.alipay.support.api.internal.util.json;

public class StdoutStreamErrorListener extends BufferErrorListener {

    public void end() {
        System.out.print(buffer.toString());
    }
}
