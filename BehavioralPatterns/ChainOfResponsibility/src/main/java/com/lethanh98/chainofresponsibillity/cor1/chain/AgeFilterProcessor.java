package com.lethanh98.chainofresponsibillity.cor1.chain;

import com.lethanh98.chainofresponsibillity.cor1.entity.UserEntity;

public class AgeFilterProcessor extends BaseFilterProcessor {
    public AgeFilterProcessor(BaseFilterProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean checkUserProcessor(UserEntity userEntity) {
        if (userEntity.getAge() >= 18) {
            return this.next(userEntity);
        }
        System.out.println("Tuổi nhỏ hơn 18");

        return false;
    }
}
