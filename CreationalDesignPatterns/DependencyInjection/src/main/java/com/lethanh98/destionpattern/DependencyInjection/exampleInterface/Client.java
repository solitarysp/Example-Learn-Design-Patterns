package com.lethanh98.destionpattern.DependencyInjection.exampleInterface;

import com.lethanh98.destionpattern.DependencyInjection.service.ServiceA;
import com.lethanh98.destionpattern.DependencyInjection.service.ServiceB;

public class Client implements ServiceAInjectInterface, ServiceBInjectInterface {
    private ServiceA serviceA;
    private ServiceB serviceB;

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
