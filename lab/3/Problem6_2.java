/**
   * file: Problem6_2.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 3
   * due date: March 2, 2017
   * version: 1.3
   * 
   * This file contains the solution for Problem 6.2 which displays the sum of all the digits of a number.
   */
   
import java.util.Scanner;

public class Problem6_2 {
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Please enter an integer"); //prompts user to input an integer
    long s = input.nextInt();
    System.out.println(sumDigits(s)); 
  }
  //Create a method to take the sum of the digits
  public static int sumDigits(long n){
	String s = Long.toString(n); //Convert to a string
    int sum = 0; //initialize variable
	  
    //Create a for loop to take sum of the digits
    for (int k=0; k < s.length(); k++){
      String a = s.charAt(k) + ""; //create a string to make s into different characters
      sum += Integer.parseInt(a); //Takes sum of the characters (digits) and converts back into an integer
  } 
    return sum;
  }
}
