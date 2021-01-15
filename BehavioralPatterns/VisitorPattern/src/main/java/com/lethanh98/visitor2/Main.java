package com.lethanh98.visitor2;

import com.lethanh98.visitor2.validate.impl.FloatValidate;
import com.lethanh98.visitor2.visitor.impl.DefaultValidateVisitor;

public class Main {
    public static void main(String[] args) {
        DefaultValidateVisitor validateVisitor = new DefaultValidateVisitor();
        FloatValidate validate = new FloatValidate();
        System.out.println(validateVisitor.visit(validate, 10.0f));;
    }
}
