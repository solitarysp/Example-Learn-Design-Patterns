package com.lethanh98.builder_pattern.example1;

public class Main {
    public static void main(String[] args) {
        Student student = new VipStudentBuilder().setName("thanh").getStudent();
        System.out.println(student.getAge());
        System.out.println(student.getName());

        //




       /*

        Student student2 = new VipStudentBuilder2().with($ -> {
            $.setName("thanh2");
            $.setSex("nam");
        }).with($ -> $.setAge(1)).createStudent();
        
        System.out.println(student2.getName());
        System.out.println(student2.getAge());*/
    }
}
