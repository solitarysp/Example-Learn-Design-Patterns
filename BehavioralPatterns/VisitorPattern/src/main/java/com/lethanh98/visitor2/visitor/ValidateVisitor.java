package com.lethanh98.visitor2.visitor;

import com.lethanh98.visitor2.validate.impl.FloatValidate;
import com.lethanh98.visitor2.validate.impl.NumberValidate;
import com.lethanh98.visitor2.validate.impl.StringValidate;

public interface ValidateVisitor {
    public boolean visit(FloatValidate floatValidate, Object data);

    public boolean visit(NumberValidate numberValidate, Object data);

    public boolean visit(StringValidate stringValidate, Object data);
}
