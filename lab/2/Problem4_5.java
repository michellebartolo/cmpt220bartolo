//Michelle Bartolo Lab 2
//Problem 4.5 
//A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree 
//(i.e., the polygon is both equilateral and equiangular). 

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
