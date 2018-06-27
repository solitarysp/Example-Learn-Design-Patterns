package com.higgsup.builder_pattern.example2;

public class Main {
    public static void main(String[] args) {
        Student student = new StudentBuild("thanh", 1).setSex("nam").builder();
        System.out.println(student.getSex());
    }
}
