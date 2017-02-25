 /**
   * file: Problem3_8.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains the solution the Problem 3.8, which asks to write a program that prompts the user to enter three integers
   * and display the integers in non-decreasing order.
   */

import java.util.Scanner;

public class IntegersSorter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    //Prompts the user to enter integer 1
    System.out.print("Enter integer #1: ");
      int int1 = input.nextInt();	  
	
    //Prompts the user to enter integer 2
    System.out.print("Enter integer #2: ");
      int int2 = input.nextInt();
	
    //Prompts the user to enter integer 3
    System.out.print("Enter integer #3: ");
      int int3 = input.nextInt();
	  
    //If integer 1 is the smallest, integer 2 is the second smallest, and integer 3 is the largest, print out: integer 1, integer 2, integer 3
    if (int1 <= int2 && int1 <= int3 && int2 <= int3) {
      System.out.println(int1);
      System.out.println(int2);
      System.out.println(int3);
    }
    //If integer 1 is the smallest, integer 3 is the second smallest, and integer 2 is the largest, print out: integer 1, integer 3, integer 2
    else if (int1 <= int3 && int1 <= int2 && int3 <= int2) {
      System.out.println(int1);
      System.out.println(int3);
      System.out.println(int2);
    }  
    //If integer 2 is the smallest, integer 1 is the second smallest, and integer 2 is the largest, print out: integer 2, integer 1, integer 3
    else if (int2 <= int1 && int2 <= int3 && int1 <= int3) {
      System.out.println(int2);
      System.out.println(int1);
      System.out.println(int3);
    }  
    //If integer 2 is the smallest, integer 3 is the second smallest, and integer 1 is the largest, print out: integer 2, integer 3, integer 1
    else if (int2 <= int1 && int2 <= int3 && int3 <= int1) {
      System.out.println(int2);
      System.out.println(int3);
      System.out.println(int1);
    }
    //If integer 3 is the smallest, integer 1 is the second smallest, and integer 2 is the largest, print out: integer 3, integer 1, integer 2 
    else if (int3 <= int1 && int3 <= int2 && int3 <= int1) {
      System.out.println(int3);
      System.out.println(int1);
      System.out.println(int2);
    }  
    //If integer 3 is the smallest, integer 2 is the second smallest, and integer 1 is the largest, print out: integer 3, integer 2, integer 1
    else if (int3 <= int2 && int3 <= int1 && int2 <= int1) {
      System.out.println(int3);
      System.out.println(int2);
      System.out.println(int1);
    }
    else {
      System.out.println("Please enter a proper integer.");
    }
  }
} 
