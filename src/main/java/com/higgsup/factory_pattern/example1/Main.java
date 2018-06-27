package com.higgsup.factory_pattern.example1;

public class Main {
    public static void main(String[] args) {
        Honda honda = (Honda) FactoryCar.getCar(TypeCar.HONDA);
        honda.view();

        Suzuki suzuki = (Suzuki) FactoryCar.getCar(TypeCar.SUZUKI);
        System.out.println(suzuki.getGuarantee().getYear());
    }
}
