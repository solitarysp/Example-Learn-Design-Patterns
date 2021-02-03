package com.lethanh98.destionpattern.DependencyInjection.exampleSetter;

import com.lethanh98.destionpattern.DependencyInjection.service.ServiceA;
import com.lethanh98.destionpattern.DependencyInjection.service.ServiceB;

public class ClientInjector {
    public static void injector(Client client) {
        client.setServiceA(new ServiceA());
        client.setServiceB(new ServiceB());
    }
}
