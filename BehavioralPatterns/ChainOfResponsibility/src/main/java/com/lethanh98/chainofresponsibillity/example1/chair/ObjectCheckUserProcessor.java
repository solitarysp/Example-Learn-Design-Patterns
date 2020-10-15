package com.lethanh98.chainofresponsibillity.example1.chair;

import com.lethanh98.chainofresponsibillity.example1.entity.UserEntity;

import java.util.Objects;

public class ObjectCheckUserProcessor extends CheckUserProcessor {
    public ObjectCheckUserProcessor(CheckUserProcessor nextProcessor) {
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
