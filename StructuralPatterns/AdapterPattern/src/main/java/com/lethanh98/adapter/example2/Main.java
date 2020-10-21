package com.lethanh98.adapter.example2;

public class Main {
    public static void main(String[] args) {
        DogVip dogVip = new DogVip();
        System.out.println("dog sua");
        dogVip.sua();
        System.out.println("======");
        CatVip catVip = new CatVip();
        System.out.println("Cat kêu");
        catVip.keu();
        System.out.println("======");

        CatMutationAdapter catMutationAdapter = new CatMutationAdapter(new DogVip());
        System.out.println("mèo đột biến kêu");
        catMutationAdapter.keu();
    }
}
