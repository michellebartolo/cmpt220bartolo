/**
  * file: Problem8_13.java
  * author: Michelle Bartolo
  * course: CMPT 220
  * assignment: Lab 5
  * due date: March 30, 2017
  * version: 1.3
  * 
  * This file contains the solution for problem 8.13 which asks to write a program that asks to
  * write a method that returns the location of the largest element in a two-dimensional array.
  */

import java.util.Scanner;

public class Problem8_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.printf("Enter the number of rows and columns of the array: ");

    int row = input.nextInt(); //row variable
    int column = input.nextInt(); //column variable
    double[][] m = new double[row][column]; //array to hold row and column contents

    System.out.println("Enter the array below: ");
    //for loop for array inputs    
    for (int i = 0; i < row; i++){
      for (int k = 0; k < column; k++){
        m[i][k] = input.nextDouble();
      }
    }
    //call locateLargest method on m
    int[] location = findLargest(m);
    System.out.printf("The location of the largest element is at (%d, %d)\n", location[0], location[1]);
  }
  /**
   * locateLargest
   * create method to find the largest element in the array and name its location
   */
  public static int[] findLargest(double[][] a) {
    int[] location = new int[] { 0, 0 }; //location array declared to hold 0
    double largestElement = a[0][0]; //largest is index of a at 0 0
    //nested for loop to go through rows and columns and compare which value is largest
    for (int i = 0; i < a.length; i++) {
      for (int k = 0; k < a[i].length; k++) {
        if (a[i][k] > largestElement) {
          location[0] = i; // row
          location[1] = k; // column
          largestElement = a[i][k];
        }
      }
    }
    return location;
  }
}