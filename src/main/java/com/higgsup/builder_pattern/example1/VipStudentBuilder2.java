package com.higgsup.builder_pattern.example1;

import java.util.function.Consumer;

public class VipStudentBuilder2 {
    private String name;
    private Integer age;
    private String sex;


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }

    public VipStudentBuilder2 with(Consumer<VipStudentBuilder2> builderFunction) {
        builderFunction.accept(this);
        return this;
    }

    public Student createStudent() {
        return new Student(name, age, sex);
    }
}
