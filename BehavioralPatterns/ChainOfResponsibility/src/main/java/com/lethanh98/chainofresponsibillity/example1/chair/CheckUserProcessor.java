package com.lethanh98.chainofresponsibillity.example1.chair;

import com.lethanh98.chainofresponsibillity.example1.entity.UserEntity;
import lombok.Data;

import java.util.Objects;

@Data
public abstract class CheckUserProcessor<T extends CheckUserProcessor> {
    public T nextProcessor;

    public CheckUserProcessor(T nextProcessor) {
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
