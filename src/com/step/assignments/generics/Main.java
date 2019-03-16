package com.step.assignments.generics;

public class Main {
    public static void main(String[] args) {
        NumberRange numberRange = new NumberRange(10, 30);
        System.out.println(numberRange.contains(20));

        AlphabetRange alphabetRange = new AlphabetRange('p', 'z');

        System.out.println(alphabetRange.contains('s'));
    }
}
