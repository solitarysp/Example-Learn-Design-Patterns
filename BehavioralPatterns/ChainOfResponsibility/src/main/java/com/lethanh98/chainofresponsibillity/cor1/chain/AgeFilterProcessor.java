package com.lethanh98.chainofresponsibillity.cor1.chain;

import com.lethanh98.chainofresponsibillity.cor1.entity.UserEntity;

public class AgeFilterProcessor extends BaseFilterProcessor {
    public AgeFilterProcessor(BaseFilterProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean checkUserProcessor(UserEntity userEntity) {
        if (userEntity.getPhoneNumber().length() > 9) {
            return this.next(userEntity);
        }
        return false;
    }
}
