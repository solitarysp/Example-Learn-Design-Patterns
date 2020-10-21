package com.lethanh98.example1;

public class FactoryCar {
    public static Car getCar(TypeCar typeCar) {
        Car car = null;
        switch (typeCar) {
            case HONDA:
                car = new Honda();
                break;
            case SUZUKI:
                Suzuki suzuki = new Suzuki();
                Guarantee guarantee = new Guarantee();
                guarantee.setYear(1);
                suzuki.setGuarantee(guarantee);
                car = suzuki;
                break;
        }
        return car;
    }
}
