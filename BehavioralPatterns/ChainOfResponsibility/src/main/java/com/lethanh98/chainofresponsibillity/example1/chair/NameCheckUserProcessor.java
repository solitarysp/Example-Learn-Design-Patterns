package com.lethanh98.chainofresponsibillity.example1.chair;

import com.lethanh98.chainofresponsibillity.example1.entity.UserEntity;

import java.util.Objects;

public class NameCheckUserProcessor extends CheckUserProcessor {
    public NameCheckUserProcessor(CheckUserProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean checkUserProcessor(UserEntity userEntity) {
        System.out.println("Start check "+getClass().getCanonicalName());

        if (Objects.nonNull(userEntity.getName()) && userEntity.getName().length() > 0) {
            return this.next(userEntity);
        }
        return false;
    }
}
