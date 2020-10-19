package com.lethanh98.chainofresponsibillity.cor3.service.validate.impl;

import com.lethanh98.chainofresponsibillity.cor3.entity.OrderEntity;
import com.lethanh98.chainofresponsibillity.cor3.service.validate.BaseValidateOrderProcessor;

public class TokenValidateProcess extends BaseValidateOrderProcessor {
    public TokenValidateProcess(BaseValidateOrderProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    protected boolean checkUserProcessor(OrderEntity orderEntity) {
        if (orderEntity.getToken().equals("token")) {
            return true;
        }
        System.out.println("Token sai");
        return false;
    }
}
