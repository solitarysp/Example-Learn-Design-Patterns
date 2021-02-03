package com.lethanh98.destionpattern.DependencyInjection.exampleInterface;

import com.lethanh98.destionpattern.DependencyInjection.service.ServiceA;

public interface ServiceAInjectInterface {
    public void setServiceA(ServiceA serviceA);

    default void injectServiceA() {
        this.setServiceA(new ServiceA());
    }
}
