package com.lethanh98.builder_pattern.example3;

public interface BuilderCar {
    public BuilderCar setName(String name);

    public BuilderCar setWeight(String weight);

    public Car build();
}
