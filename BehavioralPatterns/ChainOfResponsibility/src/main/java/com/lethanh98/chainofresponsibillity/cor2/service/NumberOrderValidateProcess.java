package com.lethanh98.chainofresponsibillity.cor2.service;

import com.lethanh98.chainofresponsibillity.cor2.entity.OrderEntity;

public class NumberOrderValidateProcess extends BaseValidateOrderProcessor {
    public NumberOrderValidateProcess(BaseValidateOrderProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean checkUserProcessor(OrderEntity orderEntity) {
        if (orderEntity.getNumberOrder() < 20) {
            return super.checkUserProcessor(orderEntity);
        }
        return false;
    }
}
