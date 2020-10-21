package com.lethanh98.builder_pattern.example3;

public class Car {
    private String name;
    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Car(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public Car() {

    }
}
