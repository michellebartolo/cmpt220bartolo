//Michelle Bartolo Lab 2
// Problem 4.1 (Geometry: area of a pentagon) Write a program that prompts the user to enter
//the length from the center of a pentagon to a vertex and computes the area of the pentagon.
// Problem 4.1 (Geometry: area of a pentagon) Write a program that prompts the user to enter
//the length from the center of a pentagon to a vertex and computes the area of the pentagon.

import java.util.Scanner;

public class PentagonCalculator {
  public static void main(String[] args) {
	  
	Scanner input = new Scanner(System.in);
	
    //Prompts the user to enter the length of the pentagon from the center to a vertex
	System.out.println("Enter the length from the center to a vertex: ");
	double r = input.nextDouble();
	
	//compute the length of a side using r
	double s = ( 2.0  * r ) * (Math.sin( (0.2) * Math.PI) );
	
	//Using the side s we just calculated, the area of the pentagon will be found.
	double area = ( ( 5.0 * (s * s) ) / ( 4.0 * Math.tan( (0.2) * (Math.PI) ) ) ) ; 
	
	double roundedarea = Math.round(area * 100.0) / 100.0;
	
	//Prints the area of the pentagon
	System.out.println("The area of the pentagon is " + roundedarea );
  }
}