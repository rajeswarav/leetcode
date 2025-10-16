package org.example.interfaceexamples;

public class Airtel implements MobileNetwork{
    @Override
    public void connect() {
        System.out.println("connect in airtel");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect connect in airtel");
    }

    @Override
    public void connect(String host, int port) {
        System.out.println("airtel connect to "+host+":"+port);
        //MobileNetwork.super.connect(host, port);
    }

    public static void main(String[] args) {
        MobileNetwork network = new Airtel();
        network.connect();
        network.disconnect();
        //network.connect("localhost", 8888);

        network.testConnect();
    }
}
