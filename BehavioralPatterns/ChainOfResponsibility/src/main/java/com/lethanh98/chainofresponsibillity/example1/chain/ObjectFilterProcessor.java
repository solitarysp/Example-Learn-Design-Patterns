package com.lethanh98.chainofresponsibillity.example1.chain;

import com.lethanh98.chainofresponsibillity.example1.entity.UserEntity;

import java.util.Objects;

public class ObjectFilterProcessor extends BaseFilterProcessor {
    public ObjectFilterProcessor(BaseFilterProcessor nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public boolean checkUserProcessor(UserEntity userEntity) {
        if (Objects.nonNull(userEntity)) {
            return this.next(userEntity);
        }
        return false;
    }
}
