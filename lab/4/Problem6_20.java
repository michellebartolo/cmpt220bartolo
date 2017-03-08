/**
   * file: Problem6_20.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 7, 2017
   * version: 1.3
   * 
   * This file contains the solution to Problem 7.9 which asks to Write a method
   * that counts the number of letters in a string 
   */
import java.util.Scanner;

public class Problem6_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    System.out.println("Please enter a string: "); //prompts user to input a string
    String s = input.nextLine(); //stores inputted string into variable s
    
    //Prints out the number of letters there are in the string using the countLetter method
    System.out.println("There are " + countLetters(s) + " letters.");
  }
  
  /*
   * countLetters
   * create method to count the number of letters within string s
   */
  public static int countLetters(String s){
	int letters = 0; //initialize letters variable, which is an integer
	
	//create a for loop to continue to increment until the length of the string inputted is reached
	for (int i = 0; i < s.length(); i++) {
	  //if statement to make sure the characters counted in the string are letters and not numbers/symbols
	  if (Character.isLetter(s.charAt(i)))
        letters++; //number of letters is incremented until the number of letters is created
    }
	return letters;
  }
}