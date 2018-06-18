package com.higgsup.singleton_pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(ConvertUntil.getInstance().convertStringToNumber("123456"));
        System.out.println(ConvertUntilCach2.getInstance().convertStringToNumber("123456"));
        System.out.println(ConvertUntilCach3.getInstance().convertStringToNumber("123456"));
    }
}
