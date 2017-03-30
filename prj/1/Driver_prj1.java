/**
  * file: Driver_prj1.java
  * author: Michelle Bartolo
  * course: CMPT 220
  * assignment: Project 1
  * due date: March 30, 2017
  * version: 1.3
  * 
  * This file contains the solution for Project 1, which asks to have the user input two vectors, and
  * uses convolution on the two inputed vectors.
  */
import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("What is the length of the first vector?");
    int length1 = input.nextInt(); //variable for size of first array
    System.out.println("Please input values for the vector:");
    double[] vFirst = new double[length1]; //variable for first array of length1

    // for loop to insert the numbers into an array
    for (int k = 0; k < vFirst.length; k++) {
      vFirst[k] = input.nextDouble();
    }

    System.out.println("What is the length of the second vector?");
    int length2 = input.nextInt(); //variable for size of second array
    
    System.out.println("Please input values for the vector:");
    double[] vSecond = new double[length2]; //variable for second array of length2

    // for loop to insert the numbers into an array
    for (int k = 0; k < vSecond.length; k++) {
      vSecond[k] = input.nextDouble();
    }
    
    double [] vResult = convolveVectors(vFirst, vSecond); //call method on first and second array to perform convolution
    
    //for loop to print out convolution results
    for (int i = 0; i < vResult.length; i++){
      System.out.print(vResult[i] + " ");
    }
  } 
  /**
    * convolveVectors
    * create method to perform the convolution action on two vectors
    */
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1]; //vResult variable initialized to size of first array and second
   
    int index = 0; //declare index at 0
    
    //while loop to make sure index is less than result length (cannot be bigger or out of bounds)
    while(index < vResult.length) {
      int shift = 0; //declare shift at 0
      //while loop to make sure shift is less than second array length
      while(shift < vSecond.length) { 
        if ((index - shift) < 0 || (index - shift) >= vFirst.length) { //if loop to check if out of bounds (cannot perform)
        }
        else {
          vResult[index] += (vFirst[index - shift] * vSecond[shift]);   //perform convolution, flip and shift
        }
        shift++; //increment shift
      }
      index++; //increment indices
    }
    return vResult;
  }
}