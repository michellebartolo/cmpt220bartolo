/**
   * file: Problem7_9.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 7, 2017
   * version: 1.3
   * 
   * This file contains the solution to Problem 7.9 which asks to write a method that finds the smallest
   * element in an array of double value.
   */

import java.util.Scanner;

public class Problem7_9 {
  public static void main(String[] args){
	
    Scanner input = new Scanner(System.in);
    double[] array = new double[10];
    
    System.out.println("Please enter 10 numbers: "); //prompts user to enter 10 digits
    
    //for loop to insert the numbers into an array
    for (int k = 0; k < array.length; k++){
      array[k] = input.nextDouble();
    }
    
    //prints out the minimum value entered by using the method
    System.out.println("The minimum value is " + min(array) ); 
  }
  
  /*
   * min
   * determines the smallest double value in an array
   */
  public static double min(double[] array){ 
    double minimum = array[0]; //initialize minimum
    
    //for loop to find minimum value of the array
    for (int i = 0; i < array.length; i++) {   
      if (array[i] < minimum) {
        minimum = array[i];
	  }
    }
    return minimum; //returns the minimum value
  }
}
