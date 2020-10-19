package com.lethanh98.chainofresponsibillity.cor2.service;

import com.lethanh98.chainofresponsibillity.cor2.entity.OrderEntity;

public class OrderService {
    public boolean order(OrderEntity orderEntity) {
        BaseValidateOrderProcessor tokenValidateProcess = new TokenValidateProcess(new NumberOrderValidateProcess(null));
        if (tokenValidateProcess.checkUserProcessor(orderEntity)) {
            System.out.println("Order thành công");
            return true;
        }
        return false;
    }
}
