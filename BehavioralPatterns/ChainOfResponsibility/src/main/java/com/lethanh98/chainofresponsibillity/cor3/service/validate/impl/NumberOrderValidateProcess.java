package com.lethanh98.chainofresponsibillity.cor3.service.validate.impl;

import com.lethanh98.chainofresponsibillity.cor3.entity.OrderEntity;
import com.lethanh98.chainofresponsibillity.cor3.service.validate.BaseValidateOrderProcessor;

public class NumberOrderValidateProcess extends BaseValidateOrderProcessor {
    public NumberOrderValidateProcess(BaseValidateOrderProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    protected boolean checkUserProcessor(OrderEntity orderEntity) {
        if (orderEntity.getNumberOrder() < 20) {
            return true;
        }
        System.out.println("Number oirder vượt quá");

        return false;
    }
}
