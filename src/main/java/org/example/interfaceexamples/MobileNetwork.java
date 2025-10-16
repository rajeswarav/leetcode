package org.example.interfaceexamples;

public interface MobileNetwork {
    void connect();
    void disconnect();
    default void connect(String host, int port) {
        System.out.println("MobileN/W Connecting to "+host+":"+port);
    }
    default void testConnect() {
        System.out.println("MobileN/W Connecting to test");
    }
}
