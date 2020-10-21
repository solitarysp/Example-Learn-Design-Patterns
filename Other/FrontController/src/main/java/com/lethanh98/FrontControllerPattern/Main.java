package com.lethanh98.FrontControllerPattern;


import com.lethanh98.FrontControllerPattern.controller.FrontController;

public class Main {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("student");
        frontController.dispatchRequest("home");
    }
}
