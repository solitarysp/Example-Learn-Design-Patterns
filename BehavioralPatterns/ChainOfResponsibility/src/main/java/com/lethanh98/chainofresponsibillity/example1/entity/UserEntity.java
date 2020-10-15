package com.lethanh98.chainofresponsibillity.example1.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntity {
    private String name;
    private Integer age;
    private String phoneNumber;

}
