package com.higgsup.FrontControllerPattern.controller;

import com.higgsup.FrontControllerPattern.controller.api.HomeController;
import com.higgsup.FrontControllerPattern.controller.api.StudentController;

public class Dispatcher {
    private StudentController studentController;
    private HomeController homeController;

    public Dispatcher() {
        studentController = new StudentController();
        homeController = new HomeController();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("student")) {
            studentController.get();
        } else {
            homeController.get();
        }
    }
}
