package com.higgsup.builder_pattern.example3;

public class BuilderCarImpl implements BuilderCar {
    private String name;
    private String weight;

    @Override
    public BuilderCar setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BuilderCar setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Car build() {
        return new Car(name, weight);
    }
}
