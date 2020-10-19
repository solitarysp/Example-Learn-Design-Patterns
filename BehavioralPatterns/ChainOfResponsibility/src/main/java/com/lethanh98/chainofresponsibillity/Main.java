package com.lethanh98.chainofresponsibillity;

import com.lethanh98.chainofresponsibillity.example1.chain.AgeFilterProcessor;
import com.lethanh98.chainofresponsibillity.example1.chain.NameFilterProcessor;
import com.lethanh98.chainofresponsibillity.example1.chain.ObjectFilterProcessor;
import com.lethanh98.chainofresponsibillity.example1.chain.PhoneFilterProcessor;
import com.lethanh98.chainofresponsibillity.example1.entity.UserEntity;

public class Main {
    public static void main(String[] args) {
        UserEntity userEntity = UserEntity.builder().age(19).name("thanh").phoneNumber("0966211618").build();
        ObjectFilterProcessor objectCheckUserProcessor = new ObjectFilterProcessor(new AgeFilterProcessor(new NameFilterProcessor(new PhoneFilterProcessor(null))));
        System.out.println(objectCheckUserProcessor.checkUserProcessor(userEntity));
    }
}
