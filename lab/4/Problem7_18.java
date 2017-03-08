/**
   * file: Problem7_18.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 7, 2017
   * version: 1.3
   * 
   * This file contains the solution to Problem 7.18 which asks to write a sort method that uses the 
   * bubble-sort algorithm. The bubblesort algorithm makes several passes through the array.Write a test
   * program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
   */
import java.util.Scanner;

public class Problem7_18 {
  public static void main(String[] args) {
    double[] speed = new double[10]; //initializes array and makes sure there are 10 entires in it
    Scanner input = new Scanner(System.in);
    
    //for loop to enter the double values of speed into the array 
    for (int k = 0; k < speed.length; k++)
      speed[k] = input.nextDouble();
    
    //bubble sort
    for (int l = 0; l < speed.length; l++) {
      for (int k = 0; k< speed.length - 1; k++) {
        if (speed[k] > speed[k+1])
          swap(speed, k, k+1);
      }	
    }
   printArr(speed);
  }
  
 /*
  * swap
  * Swaps two integers to sort using bubble sort method
  */
  static void swap(double[] arr, int idx1, int idx2) {
    double tmp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = tmp;
  }
  
  static void printArr(double[] arr) {
   for( int k=0; k < arr.length; k++) 
     System.out.println(arr[k] + " ");
  }
}
  


  
