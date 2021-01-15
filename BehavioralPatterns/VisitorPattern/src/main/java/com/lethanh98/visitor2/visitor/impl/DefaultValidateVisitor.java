package com.lethanh98.visitor2.visitor.impl;

import com.lethanh98.visitor2.validate.impl.FloatValidate;
import com.lethanh98.visitor2.validate.impl.NumberValidate;
import com.lethanh98.visitor2.validate.impl.StringValidate;
import com.lethanh98.visitor2.visitor.ValidateVisitor;

public class DefaultValidateVisitor implements ValidateVisitor {
    @Override
    public boolean visit(FloatValidate floatValidate, Object data) {
        return floatValidate.validate(data);
    }

    @Override
    public boolean visit(NumberValidate numberValidate, Object data) {
        return numberValidate.validate(data);
    }

    @Override
    public boolean visit(StringValidate stringValidate, Object data) {
        return stringValidate.validate(data);
    }
}
