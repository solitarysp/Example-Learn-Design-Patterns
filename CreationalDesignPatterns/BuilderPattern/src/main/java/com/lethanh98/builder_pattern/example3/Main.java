package com.lethanh98.builder_pattern.example3;

public class Main {
    public static void main(String[] args) {
        Car car= new BuilderCarImpl().setName("tr").setWeight("1").build();
        System.out.println(car.getName());
    }
}
