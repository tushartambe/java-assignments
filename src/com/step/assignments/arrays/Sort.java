package com.step.assignments.arrays;


// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.


public class Sort {
    public static void main(String[] args) {
        int[] numbers = {106, 26, 81, 5, 15};

        int temp;

        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = i + 1; i1 < numbers.length; i1++) {
                if (numbers[i] < numbers[i1]) {
                    temp = numbers[i];

                    numbers[i] = numbers[i1];
                    numbers[i1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
