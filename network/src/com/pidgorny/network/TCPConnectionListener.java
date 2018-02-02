package com.pidgorny.network;

public interface TCPConnectionListener {

    //Connection is OK
    void onConnectionReady(TCPConnection tcpConnection);
    //Receiving string
    void onReceiveString(TCPConnection tcpConnection, String value);
    //Disconnect
    void onDisconnect(TCPConnection tcpConnection);
    //Exception
    void onException(TCPConnection tcpConnection, Exception e);

}
