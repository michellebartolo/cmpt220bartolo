/**
  * file: Problem7_20.java
  * author: Michelle Bartolo
  * course: CMPT 220
  * assignment: Lab 5
  * due date: March 30, 2017
  * version: 1.3
  * 
  * This file contains the solution for problem 7.20 which asks to sort by finding the largest number 
  * and swapping it with the last. Write a test program that reads in ten double numbers, invokes the
  * method, and displays the sorted numbers.
  */

import java.util.Scanner;

public class Problem7_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] array = new double[10]; //array that holds 10 variables
 
    System.out.print("Please enter 10 numbers:");
    //for loop that assigns input to array
    for (int i = 0; i < array.length; i++) {
      array[i] = input.nextDouble();
    }
 
    System.out.print("The sorted numbers are: ");
 
    selectionSort(array); //method invokes array and then array is printed out in a for loop
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
 
    /**
      * selectionSort
      * create method to sort an array by finding maximum number in the array and looking at the index
      */
    public static void selectionSort(double[] array) {
      for (int i = array.length-1; i > 0; i--) {
        // Find the max in the list[list.length...1]
        double maximumNumber = array[i];
        int maximumNumberIdx = i;
    
      for (int j = 0; j < i; j++) {
        if (maximumNumber < array[j]) { //check if max is less than current variable at index
          maximumNumber = array[j]; //if less switch new variable to current max
          maximumNumberIdx = j;
        }
      }
 
      // Swap list[i] with list[currentMaxIndex] if necessary
      if (maximumNumberIdx != i) {
        array[maximumNumberIdx] = array[i];
        array[i] = maximumNumber;
      }
    }
  }
}