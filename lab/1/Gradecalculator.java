/**
  * file: Gradecalculator.java
  * author: Michelle Bartolo  
  * course: CMPT 220
  * assignment: Lab 1
  * due date: January 25, 2017
  * version: 1.3
  * 
  * This file computes final grade given midterm, final exam
  * project, and homework and lab grades
  */

import java.util.Scanner;

public class Gradecalculator {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);  // Create new Scanner object
	
    System.out.println("Please enter the following as a percentage..."); //prompts the user to input their grades
	
    System.out.println("midterm exam: "); //prompts user to input midterm grade
    double midterm = input.nextDouble();
	
    System.out.println("final exam: "); //prompts user to input final exam grade
    double finalexam = input.nextDouble();
	
    System.out.println("projects: "); //prompts user to input projects grade
    double projects = input.nextDouble();
	
    System.out.println("homework and labs: "); //prompts user to input hw/labs grades
    double homeworkandlabs = input.nextDouble();
	
    double calculate = ((midterm * .2) + (finalexam * .2) + (projects * .2) + (homeworkandlabs * .4)); //calculates their average
    System.out.println("Your final grade is: " + calculate); //displays their overall final grade
  }
}
