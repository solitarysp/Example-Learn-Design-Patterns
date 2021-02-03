package com.lethanh98.destionpattern.DependencyInjection.exampleInterface;

public class Main {
    public static void main(String[] args) {
        Client cLient = new Client();
        cLient.injectServiceA();
        cLient.injectServiceB();
    }
}
