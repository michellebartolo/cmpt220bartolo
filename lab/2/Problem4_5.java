 /**
   * file: Problem4_5.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains the solution the Problem 4.5, which asks tofind the area of a regular polygon 
   */

import java.util.Scanner;

public class PolygonArea {
  public static void main(String[] args) {	  
    Scanner input = new Scanner(System.in);

    //Prompts the user to enter the number of sides the polygon has
    System.out.println("Enter the number of sides: ");
    double n = input.nextDouble();
		
    //Prompts the user to enter the length of the sides of the polygon 
    System.out.println("Enter the length of the sides: ");
    double s = input.nextDouble();
		
    //computes area
    double area = ( ( n * (s * s) ) / ( 4.0 * ( Math.tan( ( (Math.PI) / n ) ) ) ) ); 
		
    //Prints the area of the polygon
    System.out.println("The area of the polygon is " + area );
  }
}
