package com.higgsup.builder_pattern.example3;

public class DirectorCar {
    private BuilderCarImpl builderCar=new BuilderCarImpl();

    public Car getBuilderCar() {
        return builderCar.build();
    }

    public void constructCar() {

    }
}
