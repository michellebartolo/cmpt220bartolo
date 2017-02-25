 /**
   * file: GradeCalculatorassignment.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contain the solution for the grade calculator assignment
   */

import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create new Scanner object
	
    System.out.println("Please enter the following as a percentage...");
	
    System.out.println("Midterm exam: "); //Prompt user for midterm grade
    double midterm = input.nextDouble();
	
    System.out.println("Final exam: "); //Prompts user for final exam grade
    double finalexam = input.nextDouble();
	
    System.out.println("Projects: "); //Prompts user to input projects grade
    double projects = input.nextDouble();
	
    System.out.println("Homework and Labs: "); //Promts user to input Homework and labs grade
    double homeworkandlabs = input.nextDouble();
	
    //Calculates grade using a weighted average
    double grade = ((midterm * .2) + (finalexam * .2) + (projects * .2) + (homeworkandlabs * .4)); 
	
    //if else statement to assignment percentage grade to a letter grade
    if (grade >= 95 && grade <= 100) {
      System.out.println("Your final grade is: A");
    }
    else if (grade >= 90 && grade < 95) {
      System.out.println("Your final grade is: A-");
    }
    else if (grade >= 87 && grade < 90) {
      System.out.println("Your final grade is: B+");
    }
    else if (grade >= 83 && grade < 87) {
      System.out.println("Your final grade is: B");
    }
    else if (grade >= 80 && grade < 83){
      System.out.println("Your final grade is: B-");
    }
    else if (grade >= 77 && grade < 80){
      System.out.println("Your final grade is: C+");
    }
    else if (grade >= 73 && grade < 77){
      System.out.println("Your final grade is: C");
    }
    else if (grade >= 70 && grade < 73){
      System.out.println("Your final grade is: C-");
    }
    else if (grade >= 65 && grade < 70){
      System.out.println("Your final grade is: D+");
    }
    else if (grade >= 60 && grade < 65){
      System.out.println("Your final grade is: D");
    }
    else if (grade < 60 ){
      System.out.println("Your final grade is: F");
    }
    else {
      System.out.println("Please check that the values you have entered are valid and try again."); //Makes sure user enters a valid grade
    }
  }
}

	
	
