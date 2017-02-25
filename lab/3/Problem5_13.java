/**
  * file: Problem5_13.java
  * author: Michelle Bartolo
  * course: CMPT 220
  * assignment: Lab 3
  * due date: February 23, 2017
  * version: 1.3
  * 
  * This file contains the solution for Problem 5.13 which asks to use a while loop to find the largest integer n such that n3 is less
  * than 12,000.
  */

public class Problem5_13 {
  public static void main(String[] args) {
    //initialize variables
    int n = 0;
    int nCubed = (int) (n * n * n); //nCubed it equal to n times n times n

    while (nCubed < 12000) { //while nCubed is less than 12000
      n++; //increment n by one until it is greater than 12000
      nCubed = (int) (n * n * n); //Must restate variable for code to run properly
    }
    //print the answer     
    System.out.println("The highest integer below 12000 is " +(n-1)); //(n-1) makes sure it prints the largest integer less 12000
  }
}
