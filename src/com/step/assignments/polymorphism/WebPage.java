package com.step.assignments.polymorphism;

public class WebPage implements Console {
    public String print() {
        return "This is some dummy string from Web Page";
    }

    public void click() {
        System.out.println("You have clicked on this page.");
    }

    public void display(String content) {
        System.out.println(content);
    }
}
