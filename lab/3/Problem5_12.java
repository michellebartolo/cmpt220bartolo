/**
  * file: Problem5_12.java
  * author: Michelle Bartolo
  * course: CMPT 220
  * assignment: Lab 3
  * due date: February 23, 2017
  * version: 1.3
  * 
  * This file contains the solution for Problem 5.12, which asks to use a while loop to find the smallest integer n such that n2 is
  * greater than 12,000.
  */

public class Problem5_12 {
  public static void main(String[] args) {
    //initialize variables
    int n = 0;
    int nSquared = (int) n * n; //nSquared is equal to n multiplied my itself

    while (nSquared < 12000) { //while nsquared is less than 12000
      n++; //increment n by one, keeps incrementing it by 1 until it is greater than 12000
      nSquared = (int) (n * n); //redeclare variable to make the code run properly
    }
      System.out.println("The smallest integer n in which n squared is greater 12,000 is " + n); //print out the answer
 }
}
