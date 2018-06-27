package com.higgsup.builder_pattern.example1;

public class Main {
    public static void main(String[] args) {
        Student student = new VipStudentBuilder().setName("thanh").getStudent();
        System.out.println(student.getName());
    }
}
