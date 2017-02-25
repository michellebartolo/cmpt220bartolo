 /**
   * file: Problem4_1.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains the solution the Problem 4.1, which asks to write a program that prompts the user to enter
   * the length from the center of a pentagon to a vertex and computes the area of the pentagon.
   */

import java.util.Scanner;

public class PentagonCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	  
      //Prompts the user to enter the length of the pentagon from the center to a vertex
      System.out.println("Enter the length from the center to a vertex: ");
	  
      double r = input.nextDouble(); 
      double s = ( 2.0  * r ) * (Math.sin( (0.2) * Math.PI) ); //compute the length of a side using r
      double area = ( ( 5.0 * (s * s) ) / ( 4.0 * Math.tan( (0.2) * (Math.PI) ) ) ) ; //Using the side s we just calculated, the area of the pentagon will be found.
      double roundedarea = Math.round(area * 100.0) / 100.0;
     
      System.out.println("The area of the pentagon is " + roundedarea ); //Prints the area of the pentagon
  }
}
