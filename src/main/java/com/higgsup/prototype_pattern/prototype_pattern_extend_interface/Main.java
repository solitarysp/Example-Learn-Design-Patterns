package com.higgsup.prototype_pattern.prototype_pattern_extend_interface;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        DogBlue dogBlue = new DogBlue();
        dogBlue.setName("thanh");

        DogBlue dogBlue1 = dogBlue.clone();

        System.out.println(dogBlue1.getName());
    }
}
