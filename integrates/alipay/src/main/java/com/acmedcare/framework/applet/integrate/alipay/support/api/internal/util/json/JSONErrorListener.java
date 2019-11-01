package com.acmedcare.framework.applet.integrate.alipay.support.api.internal.util.json;

public interface JSONErrorListener {
    void start(String text);

    void error(String message, int column);

    void end();
}
