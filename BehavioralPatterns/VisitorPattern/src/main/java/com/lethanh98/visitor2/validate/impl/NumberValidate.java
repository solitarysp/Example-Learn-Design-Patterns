package com.lethanh98.visitor2.validate.impl;

import com.lethanh98.visitor2.validate.Validate;

public class NumberValidate implements Validate {
    @Override
    public boolean validate(Object t) {
        if (t instanceof Integer) {
            return true;
        }
        return false;
    }

}
