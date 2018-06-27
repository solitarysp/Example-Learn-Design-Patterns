package com.higgsup.factory_pattern.example1;

public class Suzuki implements Car {
    public void view() {
        System.out.println("suzuki");
    }
    private Guarantee guarantee;

    public Guarantee getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Guarantee guarantee) {
        this.guarantee = guarantee;
    }
}
