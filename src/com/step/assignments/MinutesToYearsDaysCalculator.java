package com.step.assignments;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long days = minutes / 1440;
        long years = days / 365;
        System.out.println(minutes + " min = " + years + " y and " + days % 365 + " d");
    }
}