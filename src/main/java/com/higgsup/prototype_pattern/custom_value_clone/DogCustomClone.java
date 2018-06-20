package com.higgsup.prototype_pattern.custom_value_clone;

public class DogCustomClone implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DogCustomClone dogCustomClone = (DogCustomClone) super.clone();
        dogCustomClone.setName(dogCustomClone.getName() + 1);
        return dogCustomClone;
    }
}
