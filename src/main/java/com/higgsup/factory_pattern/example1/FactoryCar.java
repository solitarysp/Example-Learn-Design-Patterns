package com.higgsup.factory_pattern.example1;

public class FactoryCar {
    public Car getCar(TypeCar typeCar) {
        Car car = null;
        switch (typeCar) {
            case HONDA:
                car = new Honda();
                break;
            case SUZUKI:
                car = new Suzuki();
                break;
        }
        return car;
    }
}
