/**
   * file: Driver_lab3.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 23, 2017
   * version: 1.3
   * 
   * This file contains the the Driver_lab3.java file that was submitted to kattis
   */
import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
	  
    //while loop for output iteration	
    while(true) {
      double x1 = s.nextDouble();
    //if loop if if x not 0 continues computation		
    if(x1 == 0.0) {
      break;
    }
    double y1 = s.nextDouble();
    double x2 = s.nextDouble();
    double y2 = s.nextDouble();
    double p = s.nextDouble();  		
    double answer = Math.pow(Math.pow(Math.abs(x1 - x2), p) + (Math.pow(Math.abs(y1 - y2),p)) , (1/p)); //Find the distance
	  
    System.out.println(answer); //Print out the distance 
    }
  }
}
