package com.lethanh98.chainofresponsibillity.cor1.chain;

import com.lethanh98.chainofresponsibillity.cor1.entity.UserEntity;

public class PhoneFilterProcessor extends BaseFilterProcessor {
    public PhoneFilterProcessor(BaseFilterProcessor nextProcessor) {
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
