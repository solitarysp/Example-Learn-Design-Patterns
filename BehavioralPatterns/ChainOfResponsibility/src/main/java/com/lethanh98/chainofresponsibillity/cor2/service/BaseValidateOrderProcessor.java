package com.lethanh98.chainofresponsibillity.cor2.service;

import com.lethanh98.chainofresponsibillity.cor2.entity.OrderEntity;
import lombok.Data;

import java.util.Objects;

@Data
public abstract class BaseValidateOrderProcessor<T extends BaseValidateOrderProcessor> {
    public T nextProcessor;

    public BaseValidateOrderProcessor(T nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public boolean checkUserProcessor(OrderEntity orderEntity) {
        if (Objects.nonNull(nextProcessor)) {
            return nextProcessor.checkUserProcessor(orderEntity);
        }
        return true;
    }
}
