package com.higgsup.FrontControllerPattern;

import com.higgsup.FrontControllerPattern.controller.FrontController;

public class Main {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("student");
        frontController.dispatchRequest("home");
    }
}
