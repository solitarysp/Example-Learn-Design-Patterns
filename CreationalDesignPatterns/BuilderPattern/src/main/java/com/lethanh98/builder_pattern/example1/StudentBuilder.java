package com.lethanh98.builder_pattern.example1;

public interface StudentBuilder {
    public StudentBuilder setName(String name);

    public StudentBuilder setSex(String sex);

    public StudentBuilder setAge(Integer age);

    public Student getStudent();
}
