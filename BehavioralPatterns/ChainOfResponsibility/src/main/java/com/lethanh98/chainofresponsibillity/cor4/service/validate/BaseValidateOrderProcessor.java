package com.lethanh98.chainofresponsibillity.cor4.service.validate;

import com.lethanh98.chainofresponsibillity.cor4.entity.OrderEntity;
import com.lethanh98.chainofresponsibillity.cor4.functional.ErrorLambda;
import com.lethanh98.chainofresponsibillity.cor4.functional.NextLambda;
import lombok.Data;

import java.util.Objects;

@Data
public abstract class BaseValidateOrderProcessor<T extends BaseValidateOrderProcessor> {
    public T nextProcessor;
    private NextLambda nextLambda;
    private ErrorLambda errorLambda;

    public BaseValidateOrderProcessor(T nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    protected abstract boolean checkUserProcessor(OrderEntity orderEntity);

    public BaseValidateOrderProcessor onNext(NextLambda nextLambda) {
        this.nextLambda = nextLambda;
        nextProcessor.setNextLambda(nextLambda);
        return this;
    }

    public BaseValidateOrderProcessor onError(ErrorLambda errorLambda) {
        this.errorLambda = errorLambda;
        nextProcessor.setErrorLambda(errorLambda);
        return this;
    }

    public void validate(OrderEntity orderEntity) {
        try {
            if (checkUserProcessor(orderEntity)) {
                if (Objects.nonNull(nextProcessor)) {
                    nextProcessor.validate(orderEntity);
                } else {
                    if (Objects.nonNull(nextLambda)) {
                        nextLambda.onNext();
                    }
                }
            }
        } catch (Exception e) {
            if (Objects.nonNull(errorLambda)) {
                errorLambda.onError(e);
            }
        }
    }
}
