package com.lethanh98.prototype.custom_value_clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        DogCustomClone dogCustomClone=new DogCustomClone();
        dogCustomClone.setName("thanh");

        DogCustomClone dogCustomClone1= (DogCustomClone) dogCustomClone.clone();
        System.out.println(dogCustomClone1.getName());
    }
}
