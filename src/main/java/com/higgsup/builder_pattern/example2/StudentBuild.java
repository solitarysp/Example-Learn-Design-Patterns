package com.higgsup.builder_pattern.example2;

public class StudentBuild {
    private String name;
    private Integer age;
    private String sex;

    public StudentBuild(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public StudentBuild setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuild setAge(Integer age) {
        this.age = age;
        return this;
    }

    public StudentBuild setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Student builder() {
        return new Student(name, age, sex);
    }
}
