package com.higgsup.prototype_pattern;

public class Role implements Cloneable {

    private String value;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
