package com.lethanh98.chainofresponsibillity.problem2.service;

import com.lethanh98.chainofresponsibillity.problem2.entity.OrderEntity;

public class OrderService {
   public boolean order(OrderEntity orderEntity) {
        TokenValidateProcess tokenValidateProcess = new TokenValidateProcess();
        if (!tokenValidateProcess.tokenValidate(orderEntity)) {
            return false;
        }
        System.out.println("Order thành công");
        return true;
    }
}
