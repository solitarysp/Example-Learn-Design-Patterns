package com.higgsup.factory_pattern.example1;

public class Main {
    public static void main(String[] args) {
        Honda honda = (Honda) new FactoryCar().getCar(TypeCar.HONDA);
        honda.view();
    }
}
