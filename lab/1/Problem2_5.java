/**
  * file: Problem2_5.java
  * author: Michelle Bartolo
  * course: CMPT 220
  * assignment: Lab 1
  * due date: January 25, 2017
  * version: 1.3
  * 
  * This file contains the solution to problem 2.5
  */
   
import java.util.Scanner;

public class Problem2_5 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in); // Create new Scanner object.
    
    // Prompt the user to enter the subtotal and the gratuity rate
    System.out.print("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

    // Calculate gratuity and total
    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

    // Display results
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
  }
}
