package com.higgsup.prototype_pattern;

public class Role implements Cloneable  {
    private String value;

    public String getValue() {
        return value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setValue(String value) {
        this.value = value;
    }
}
