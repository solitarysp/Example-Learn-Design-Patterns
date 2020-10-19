package com.lethanh98.chainofresponsibillity.cor3.service.validate;

import com.lethanh98.chainofresponsibillity.cor3.entity.OrderEntity;
import lombok.Data;

import java.util.Objects;

@Data
public abstract class BaseValidateOrderProcessor<T extends BaseValidateOrderProcessor> {
    public T nextProcessor;

    public BaseValidateOrderProcessor(T nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    protected abstract boolean checkUserProcessor(OrderEntity orderEntity);

    public boolean validate(OrderEntity orderEntity) {
        if (checkUserProcessor(orderEntity)) {
            if (Objects.nonNull(nextProcessor)) {
                return nextProcessor.validate(orderEntity);
            } else {
                return true;
            }
        }
        return false;
    }
}
