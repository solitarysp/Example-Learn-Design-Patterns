package com.lethanh98.chainofresponsibillity.cor3.service.impl;

import com.lethanh98.chainofresponsibillity.cor3.entity.OrderEntity;
import com.lethanh98.chainofresponsibillity.cor3.service.validate.BaseValidateOrderProcessor;
import com.lethanh98.chainofresponsibillity.cor3.service.validate.impl.NumberOrderValidateProcess;
import com.lethanh98.chainofresponsibillity.cor3.service.validate.impl.TokenValidateProcess;

public class OrderService {
    public boolean order(OrderEntity orderEntity) {
        BaseValidateOrderProcessor tokenValidateProcess = new TokenValidateProcess(new NumberOrderValidateProcess(null));
        if (tokenValidateProcess.validate(orderEntity)) {
            System.out.println("Order thành công");
            return true;
        }
        return false;
    }
}
