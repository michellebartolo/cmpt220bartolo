/**
  * file: Problem2_6.java
  * author: Michelle Bartolo  
  * course: CMPT 220
  * assignment: Lab 1
  * due date: January 25, 2017
  * version: 1.3
  * 
  * This file contains the solution to problem 2.6
  */
  
import java.util.Scanner;

public class Problem2_6 {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);  // Create new Scanner object

    // Prompt the user to enter a number between 0 and 1000.
    System.out.print("Enter a number between 0 and 1000: ");
    int number = input.nextInt();

    // Compute the sum of the digits in the integer.
    int lessThan10 = number % 10;  // Extract the digit less than 10
    number /= 10;  // Remove the extracted digit
    int tens = number % 10;  // Extract the digit between 10 to 99
    number /= 10;  // Remove the extracted digit
    int hundreds = number % 10;  // Extract the digit between 100 to 999
    number /= 10;  // Remove the extracted digit
    int sum = hundreds + tens + lessThan10;	

    // Display results
    System.out.println("The sum of the digits is " + sum);
  }
}
