package com.lethanh98.destionpattern.DependencyInjection.exampleSetter;

public class MainTest {
    public static void main(String[] args) {
        Client client = new Client();
        ClientInjector.injector(client);
    }
}
