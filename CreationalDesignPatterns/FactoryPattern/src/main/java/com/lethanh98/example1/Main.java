package com.lethanh98.example1;

public class Main {
    public static void main(String[] args) {
        Car honda = FactoryCar.getCar(TypeCar.HONDA);
        honda.view();

        Car suzuki =  FactoryCar.getCar(TypeCar.SUZUKI);
        suzuki.view();
    }
}
