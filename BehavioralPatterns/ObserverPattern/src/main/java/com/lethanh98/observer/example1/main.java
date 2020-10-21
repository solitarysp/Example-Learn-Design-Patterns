package com.lethanh98.observer.example1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Soccer-Match [2014AUG24]");
        Observer observer = new SMSUsers(subject, "Adam Warner [New York]");
        observer.subscribe();
        System.out.println();
        Observer observer2 = new SMSUsers(subject, "Tim Ronney [London]");
        observer2.subscribe();
        Commentary cObject = ((Commentary) subject);

        cObject.setDesc("Welcome to live Soccer match");
        cObject.setDesc("Current score 0-0");

    }
}
