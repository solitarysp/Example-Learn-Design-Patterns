package com.lethanh98.destionpattern.DependencyInjection.exampleInterface;

import com.lethanh98.destionpattern.DependencyInjection.service.ServiceB;

public interface ServiceBInjectInterface {
    public void setServiceB(ServiceB serviceB);

    default void injectServiceB() {
        this.setServiceB(new ServiceB());
    }
}
