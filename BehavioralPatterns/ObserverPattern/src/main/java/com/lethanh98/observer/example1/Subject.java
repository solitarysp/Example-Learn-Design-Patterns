package com.lethanh98.observer.example1;

public interface Subject {
    public void subscribeObserver(Observer observer);

    public void unSubscribeObserver(Observer observer);

    public void notifyObservers();

    public String subjectDetails();
}
