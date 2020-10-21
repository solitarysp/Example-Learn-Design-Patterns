package com.lethanh98.prototype.prototype_pattern_extend_interface;

public interface Dog extends Cloneable {
    public DogBlue clone() throws CloneNotSupportedException;
}
