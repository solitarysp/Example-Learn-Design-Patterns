package com.higgsup.Adapter_pattern.example2;

public class CatMutationAdapter implements Cat {
    private Dog dog;

    public CatMutationAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void keu() {
        dog.sua();
    }
}
