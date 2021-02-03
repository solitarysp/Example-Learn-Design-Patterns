package com.lethanh98.destionpattern.DependencyInjection.exampleConstructor;

import com.lethanh98.destionpattern.DependencyInjection.service.ServiceA;
import com.lethanh98.destionpattern.DependencyInjection.service.ServiceB;

public class TestMain {
    public static void main(String[] args) {
        Client client = new Client(new ServiceA(), new ServiceB());
    }
}
