package com.lethanh98.prototype.prototype_pattern_extend_interface;

public class DogBlue implements Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DogBlue clone() throws CloneNotSupportedException {
        return (DogBlue) super.clone();
    }
}
