package com.lethanh98.chainofresponsibillity.cor4.functional;

@FunctionalInterface
public interface ErrorLambda {
    void onError(Exception e);
}
