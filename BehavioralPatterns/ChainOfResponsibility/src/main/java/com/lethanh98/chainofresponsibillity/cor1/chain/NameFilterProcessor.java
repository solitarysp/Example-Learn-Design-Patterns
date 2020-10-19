package com.lethanh98.chainofresponsibillity.cor1.chain;

import com.lethanh98.chainofresponsibillity.cor1.entity.UserEntity;

import java.util.Objects;

public class NameFilterProcessor extends BaseFilterProcessor {
    public NameFilterProcessor(BaseFilterProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean checkUserProcessor(UserEntity userEntity) {
        if (Objects.nonNull(userEntity.getName()) && userEntity.getName().length() > 0) {
            return this.next(userEntity);
        }
        return false;
    }
}
