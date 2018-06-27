package com.higgsup.builder_pattern.example1;

public class VipStudentBuilder implements StudentBuilder {
    private Student student = new Student();

    public void buildName() {
        student.setName("thanh");
    }


    public VipStudentBuilder setName(String name) {
        student.setName(name);
        return this;
    }

    public VipStudentBuilder setSex(String sex) {
        student.setSex(sex);
        return this;
    }

    public VipStudentBuilder setAge(Integer age) {
        student.setAge(age);
        return this;
    }

    public Student getStudent() {
        return student;
    }
}
