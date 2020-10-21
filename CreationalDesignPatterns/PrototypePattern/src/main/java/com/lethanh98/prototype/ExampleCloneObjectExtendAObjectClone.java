package com.lethanh98.prototype;

public class ExampleCloneObjectExtendAObjectClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        RoleVip roleVip = new RoleVip();
        roleVip.setType("vip 1");
        roleVip.setValue("lethanh");
        RoleVip roleVip1 = (RoleVip) roleVip.clone();
        System.out.println(roleVip1.getType());
        System.out.println(roleVip1.getValue());
    }
}
