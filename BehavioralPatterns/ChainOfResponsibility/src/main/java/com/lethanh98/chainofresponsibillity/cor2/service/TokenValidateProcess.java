package com.lethanh98.chainofresponsibillity.cor2.service;

import com.lethanh98.chainofresponsibillity.cor2.entity.OrderEntity;

public class TokenValidateProcess extends BaseValidateOrderProcessor {
    public TokenValidateProcess(BaseValidateOrderProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean checkUserProcessor(OrderEntity orderEntity) {
        if (orderEntity.getToken().equals("token")) {
            return super.checkUserProcessor(orderEntity);
        }
        return false;
    }
}
