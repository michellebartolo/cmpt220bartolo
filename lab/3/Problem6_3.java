/**
   * file: Problem6_3.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 3
   * due date: March 2, 2017
   * version: 1.3
   * 
   * This file contains the solution for Problem 6.3 which determines whether
   * a number is a palindrome or not by reversing the digits of an inputted integer.
   */
   
import java.util.Scanner;

public class Problem6_3 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
  
    System.out.println("Please enter an integer: ");
    int number = input.nextInt();

    //if else statement to print out if a number is a palindrome or not
    if(isPalindrome(number)){
      System.out.println(number + " is a palindrome");
    }
    else {
      System.out.println(number + " is not a palindrome");
    }       
  }

//Create a method to put the number in reverse order
  public static int reverse(int number){
    int reverse = 0; //intialize variable

    //while loop to reverse the order of the digits of a number when a number isn't 0
    while (number != 0) {
      int remainder = number % 10; //
      reverse = reverse * 10 + remainder;
      number /= 10;
    }
  return reverse;
  }
  
  //Create a method to determine if the number is a palindrome
  public static boolean isPalindrome(int number) {
    // if statement to see if the original number and reserve of the number is the same 
    if (number == reverse(number)) {
      return true;
    } 
    else {
      return false;
    }
  }
}