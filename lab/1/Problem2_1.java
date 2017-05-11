/**
  * file: Problem2_1.java
  * author: Michelle Bartolo
  * course: CMPT 220
  * assignment: Lab 1
  * due date: January 25, 2017
  * version: 1.3
  * 
  * This file contains the solution to problem 2.1
  */

import java.util.Scanner;

public class Problem2_1 {
  public static void main(String[] args) {
    // Create new Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt user to input a double
    System.out.print("Enter a degree in Celsius: ");
    double celsius = input.nextDouble();

    // Convert Celsius to Fahrenheit
    double fahrenheit = 9.0 / 5 * celsius + 32;

    // Display results
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit"); 
  }
}
