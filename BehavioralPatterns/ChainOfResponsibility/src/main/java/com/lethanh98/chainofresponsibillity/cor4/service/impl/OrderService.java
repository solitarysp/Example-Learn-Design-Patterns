package com.lethanh98.chainofresponsibillity.cor4.service.impl;

import com.lethanh98.chainofresponsibillity.cor4.entity.OrderEntity;
import com.lethanh98.chainofresponsibillity.cor4.service.validate.BaseValidateOrderProcessor;
import com.lethanh98.chainofresponsibillity.cor4.service.validate.impl.NumberOrderValidateProcess;
import com.lethanh98.chainofresponsibillity.cor4.service.validate.impl.TokenValidateProcess;

public class OrderService {
    public void order(OrderEntity orderEntity) {
        BaseValidateOrderProcessor tokenValidateProcess = new TokenValidateProcess(new NumberOrderValidateProcess(null));
        tokenValidateProcess.onNext(() -> {
            System.out.println("Thành công");
        }).onError(e -> {
            System.out.println(e.getMessage());
        });
        tokenValidateProcess.validate(orderEntity);
    }
}
