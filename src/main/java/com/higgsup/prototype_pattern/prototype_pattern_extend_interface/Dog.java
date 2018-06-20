package com.higgsup.prototype_pattern.prototype_pattern_extend_interface;

public interface Dog extends Cloneable {
    public DogBlue clone() throws CloneNotSupportedException;
}
