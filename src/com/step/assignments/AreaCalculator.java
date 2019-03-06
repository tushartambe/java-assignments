package com.step.assignments;

public class AreaCalculator {
    public static double area(double r) {
        if (r < 0) {
            return -1;
        }
        return r * r * Math.PI;
    }

    public static double area(double l, double b) {
        if (l < 0 || b < 0) {
            return -1;
        }
        return l * b;
    }
}
