package com.lethanh98.chainofresponsibillity.cor1.chain;

import com.lethanh98.chainofresponsibillity.cor1.entity.UserEntity;

public class PhoneFilterProcessor extends BaseFilterProcessor {
    public PhoneFilterProcessor(BaseFilterProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean checkUserProcessor(UserEntity userEntity) {
        if (userEntity.getPhoneNumber().length() > 9) {
            return this.next(userEntity);
        }
        System.out.println("Số lượng ký tự phone đang nhỏ hơn 9");
        return false;
    }
}
