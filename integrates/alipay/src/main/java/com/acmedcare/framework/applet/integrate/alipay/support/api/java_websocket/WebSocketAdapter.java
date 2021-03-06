/*
 * Copyright (c) 2010-2018 Nathan Rajlich
 *
 *  Permission is hereby granted, free of charge, to any person
 *  obtaining a copy of this software and associated documentation
 *  files (the "Software"), to deal in the Software without
 *  restriction, including without limitation the rights to use,
 *  copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the
 *  Software is furnished to do so, subject to the following
 *  conditions:
 *
 *  The above copyright notice and this permission notice shall be
 *  included in all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 *  OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 *  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 *  WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 *  FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 *  OTHER DEALINGS IN THE SOFTWARE.
 */

package com.acmedcare.framework.applet.integrate.alipay.support.api.java_websocket;

import com.acmedcare.framework.applet.integrate.alipay.support.api.java_websocket.drafts.Draft;
import com.acmedcare.framework.applet.integrate.alipay.support.api.java_websocket.exceptions.InvalidDataException;
import com.acmedcare.framework.applet.integrate.alipay.support.api.java_websocket.framing.Framedata;
import com.acmedcare.framework.applet.integrate.alipay.support.api.java_websocket.framing.PingFrame;
import com.acmedcare.framework.applet.integrate.alipay.support.api.java_websocket.framing.PongFrame;
import com.acmedcare.framework.applet.integrate.alipay.support.api.java_websocket.handshake.ClientHandshake;
import com.acmedcare.framework.applet.integrate.alipay.support.api.java_websocket.handshake.HandshakeImpl1Server;
import com.acmedcare.framework.applet.integrate.alipay.support.api.java_websocket.handshake.ServerHandshake;
import com.acmedcare.framework.applet.integrate.alipay.support.api.java_websocket.handshake.ServerHandshakeBuilder;

/**
 * This class default implements all methods of the WebSocketListener that can be overridden optionally when advances functionalities is
 * needed.<br>
 **/
public abstract class WebSocketAdapter implements WebSocketListener {

    /**
     * This default implementation does not do anything. Go ahead and overwrite it.
     *
     * @see WebSocketListener#onWebsocketHandshakeReceivedAsServer(WebSocket, Draft, ClientHandshake)
     */

    public ServerHandshakeBuilder onWebsocketHandshakeReceivedAsServer(WebSocket conn, Draft draft, ClientHandshake request) throws
            InvalidDataException {
        return new HandshakeImpl1Server();
    }

    public void onWebsocketHandshakeReceivedAsClient(WebSocket conn, ClientHandshake request, ServerHandshake response) throws
            InvalidDataException {
        //To overwrite
    }

    /**
     * This default implementation does not do anything which will cause the connections to always progress.
     *
     * @see WebSocketListener#onWebsocketHandshakeSentAsClient(WebSocket, ClientHandshake)
     */

    public void onWebsocketHandshakeSentAsClient(WebSocket conn, ClientHandshake request) throws InvalidDataException {
        //To overwrite
    }

    /**
     * This default implementation will send a pong in response to the received ping. The pong frame will have the same payload as the ping
     * frame.
     *
     * @see WebSocketListener#onWebsocketPing(WebSocket, Framedata)
     */

    public void onWebsocketPing(WebSocket conn, Framedata f) {
        conn.sendFrame(new PongFrame((PingFrame) f));
    }

    /**
     * This default implementation does not do anything. Go ahead and overwrite it.
     *
     * @see WebSocketListener#onWebsocketPong(WebSocket, Framedata)
     */

    public void onWebsocketPong(WebSocket conn, Framedata f) {
        //To overwrite
    }
}
