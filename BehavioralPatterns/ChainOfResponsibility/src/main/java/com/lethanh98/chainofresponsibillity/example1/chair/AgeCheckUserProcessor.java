package com.lethanh98.chainofresponsibillity.example1.chair;

import com.lethanh98.chainofresponsibillity.example1.entity.UserEntity;

public class AgeCheckUserProcessor extends CheckUserProcessor {
    public AgeCheckUserProcessor(CheckUserProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean checkUserProcessor(UserEntity userEntity) {
        if (userEntity.getAge() > 20) {
            return this.next(userEntity);
        }
        return false;
    }
}
