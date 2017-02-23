/**
   * file: Problem5_13.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 23, 2017
   * version: 1.3
   * 
   * This file contains the declaration of the SinglyLinkedList abstract data
   * type.
   */
//5.13 (Find the largest n such that n3 < 12,000) Use a while loop to find the largest integer n such that n3 is less than 12,000.
public class Problem5_13 {
	public static void main(String[] args) {
	    //initialize variables
		int n = 0;
	    int nCubed = (int) (n * n * n); //nCubed it equal to n times n times n

	    while (nCubed < 12000) { //while nCubed is less than 12000
	        n++; //increment n by one until it is greater than 12000
	        nCubed = (int) (n * n * n); //Must restate variable for code to run properly
	    }
	    System.out.println("The highest integer below 12000 is " +(n-1)); //print the answer, n-1 because it increments the value until it is greater than 12000, so this makes sure it is the largest integer less than 12000
	 }
}
