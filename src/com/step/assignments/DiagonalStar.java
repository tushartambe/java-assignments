package com.step.assignments;

public class DiagonalStar {
    public static void main(String[] args) {

        printSqaureStar(5);
    }
    public static void printSqaureStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }

        for (int row = 0; row < number; row++){
            for (int column = 0; column < number; column++){
                if (row == column){
                    System.out.println("*");
                }
            }
        }

    }
}
