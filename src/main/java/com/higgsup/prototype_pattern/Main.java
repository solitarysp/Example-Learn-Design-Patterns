package com.higgsup.prototype_pattern;

public class Main {
    public static void main(String[] args) {
        Role role = new Role();
        //có thể phải lấy từ db..vv...
        role.setValue("thanh");
        try {
            Role role1= (Role) role.clone();
            System.out.println(role1.getValue());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
