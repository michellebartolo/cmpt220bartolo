//Michelle Bartolo - Lab 3 - Problem 5.1 - 2/23/17
//*5.1 (Count positive and negative numbers and compute the average of numbers) Write
//a program that reads an unspecified number of integers, determines how many
//positive and negative values have been read, and computes the total and average of
//the input values (not counting zeros). Your program ends with the input 0. Display
//the average as a floating-point number. 

import java.util.Scanner;

public class Problem5_1 {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in); // Create new Scanner object
    //initialize/ declare variables
    int sum = 0;
    int positive = 0;
    int negative = 0;
    double total=0.0 ;
    int number;
    double average = 0.0;
	
    // Keeps "doing" the statements until the input is 0
    do {
	System.out.println("Enter an integer, the input ends if it is 0: "); //Prompts the user the to enter integers
      number = input.nextInt(); //Allows user to input an integer and store it in the number variable
      total++; //Increments by 1
      sum += number; //sum is equal to sum + number
      if (number > 0) {
        positive++; //if the number is greater than zero, add one to the positive number amount
      }
      else if (number < 0){
        negative++; //if the number is less than zero, add one to the negative number amount
      }
    } while (number != 0); //continue while the inputted number is not equal to zero 
    
    average = (sum / (total - 1.0 )); //find the average of the inputted numbers by taking their sum and dividing it by the total minus one because we do not want to include the zero the user inputted 
    System.out.println("The number of positive integers is " + positive); //print out the amount of positive integers
    System.out.println("The number of negative integers is " + negative); //print out the amount of negative integers
    System.out.println("The total is " + total); //print out the total number of integers inputted
	System.out.println("The average is " + average); //print out the average of the integers inputted
  }
}