package com.lethanh98.chainofresponsibillity.cor4.service.validate.impl;

import com.lethanh98.chainofresponsibillity.cor4.entity.OrderEntity;
import com.lethanh98.chainofresponsibillity.cor4.service.validate.BaseValidateOrderProcessor;

public class NumberOrderValidateProcess extends BaseValidateOrderProcessor {
    public NumberOrderValidateProcess(BaseValidateOrderProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    protected boolean checkUserProcessor(OrderEntity orderEntity) {
        if (orderEntity.getNumberOrder() < 20) {
            return true;
        }
        throw new RuntimeException("Max quá number");
    }
}
