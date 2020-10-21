package com.lethanh98.prototype.deep;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //tạo 1 student có implements Cloneable nhưng addread có implements Cloneable
        Student student = createStudent();
        //show value hiện tại
        System.out.println(student.toString());
        //clone vallue và trong method clone có clone lại address
        Student studentClone = (Student) student.clone();
        //chang value addread ở bản gốc
        student.setName("nam");
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
