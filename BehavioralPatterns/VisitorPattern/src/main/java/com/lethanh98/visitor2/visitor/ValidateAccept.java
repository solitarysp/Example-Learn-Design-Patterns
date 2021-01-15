package com.lethanh98.visitor2.visitor;

public interface ValidateAccept {
    public void accept(ValidateVisitor visitor);

    public boolean validate(Object data);
}
