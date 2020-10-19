package com.lethanh98.chainofresponsibillity.problem2.service;

import com.lethanh98.chainofresponsibillity.problem2.entity.OrderEntity;

public class TokenValidateProcess {
    public boolean tokenValidate(OrderEntity orderEntity) {
        if ("token".equals(orderEntity.getToken())) {
            NumberOrderValidateProcess numberOrderValidateProcess = new NumberOrderValidateProcess();
            return numberOrderValidateProcess.numberOrderValidate(orderEntity.getNumberOrder());
        }
        return false;
    }
}
