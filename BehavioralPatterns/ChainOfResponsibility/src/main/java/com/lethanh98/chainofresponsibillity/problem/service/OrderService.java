package com.lethanh98.chainofresponsibillity.problem.service;

import com.lethanh98.chainofresponsibillity.problem.entity.OrderEntity;

public class OrderService {
   public boolean order(OrderEntity orderEntity) {
        TokenValidateProcess tokenValidateProcess = new TokenValidateProcess();
        if (!tokenValidateProcess.tokenValidate(orderEntity.getToken())) {
            return false;
        }
        NumberOrderValidateProcess numberOrderValidateProcess = new NumberOrderValidateProcess();
        if (!numberOrderValidateProcess.numberOrderValidate(orderEntity.getNumberOrder())) {
            return false;
        }
        System.out.println("Order thành công");
        return true;
    }
}
