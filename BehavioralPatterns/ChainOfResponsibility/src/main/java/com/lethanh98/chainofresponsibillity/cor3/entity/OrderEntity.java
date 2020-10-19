package com.lethanh98.chainofresponsibillity.cor3.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderEntity {
    private String nameOrder;
    private String token;
    private Integer numberOrder;

}
