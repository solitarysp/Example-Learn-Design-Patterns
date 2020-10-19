package com.lethanh98.chainofresponsibillity.example1.chain;

import com.lethanh98.chainofresponsibillity.example1.entity.UserEntity;
import lombok.Data;

import java.util.Objects;

@Data
public abstract class BaseFilterProcessor<T extends BaseFilterProcessor> {
    public T nextProcessor;

    public BaseFilterProcessor(T nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean checkUserProcessor(UserEntity userEntity);

    public final boolean next(UserEntity userEntity) {
        if (Objects.nonNull(nextProcessor)) {
            return nextProcessor.checkUserProcessor(userEntity);
        }
        return true;
    }
}
