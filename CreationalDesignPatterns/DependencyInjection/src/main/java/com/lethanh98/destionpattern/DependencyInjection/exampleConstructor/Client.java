package com.lethanh98.destionpattern.DependencyInjection.exampleConstructor;

import com.lethanh98.destionpattern.DependencyInjection.service.ServiceA;
import com.lethanh98.destionpattern.DependencyInjection.service.ServiceB;

public class Client {
    private ServiceA serviceA;
    private ServiceB serviceB;

    public Client(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }
}
