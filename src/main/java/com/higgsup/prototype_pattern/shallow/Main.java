package com.higgsup.prototype_pattern.shallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //tạo 1 student có implements Cloneable nhưng addread không implements Cloneable
        Student student = createStudent();
        //show value hiện ntaij
        System.out.println(student.toString());
        //clone vallue
        Student studentClone = (Student) student.clone();
        //chang value addread ở bản gốc
        student.getAddress().setName("sài gòn");

        //show ra value thì bị thay đổi vì address không implements Cloneable
        System.out.println(studentClone.toString());
    }

    private static Student createStudent() {
        Student student = new Student();
        student.setName("thanh");
        Address address = new Address();
        address.setName("hà nội");
        student.setAddress(address);
        return student;
    }
}
