package com.lethanh98.chainofresponsibillity;

import com.lethanh98.chainofresponsibillity.example1.chair.AgeCheckUserProcessor;
import com.lethanh98.chainofresponsibillity.example1.chair.NameCheckUserProcessor;
import com.lethanh98.chainofresponsibillity.example1.chair.ObjectCheckUserProcessor;
import com.lethanh98.chainofresponsibillity.example1.entity.UserEntity;

public class Main {
    public static void main(String[] args) {
        UserEntity userEntity = UserEntity.builder().age(33).name("thanh").phoneNumber("0966211618").build();
        ObjectCheckUserProcessor objectCheckUserProcessor = new ObjectCheckUserProcessor(new AgeCheckUserProcessor(new NameCheckUserProcessor(null)));
        System.out.println(objectCheckUserProcessor.checkUserProcessor(userEntity));
    }
}
