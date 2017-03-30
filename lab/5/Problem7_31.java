/**
  * file: Problem7_31.java
  * author: Michelle Bartolo
  * course: CMPT 220
  * assignment: Lab 5
  * due date: March 30, 2017
  * version: 1.3
  * 
  * This file contains the solution for problem which asks to write a method that merges
  * two sorted lists into a new sorted list.
  */

import java.util.Scanner;

public class Problem7_31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two lists
    System.out.print("Enter list1: ");
    int[] list1 = new int[input.nextInt()]; // make array to hold list
    //for loop for list inputs
    for (int i = 0; i < list1.length; i++) {
      list1[i] = input.nextInt();
    }


    System.out.print("Enter list2: ");
    int[] list2 = new int[input.nextInt()]; //another array for second list
    //for loop for list inputs
    for (int i = 0; i < list2.length; i++) {
      list2[i] = input.nextInt();
    }

    // Merge list 1 and list 2 together
    int[] mergedList = merge(list1, list2);

    // Display the merged list
    System.out.print("The merged list is ");
    
    for (int i = 0; i < mergedList.length; i++) {
      System.out.print(mergedList[i] + " ");
    }
    System.out.println();
  }

	/** merge 
	  * merges two sorted lists into a new sorted list.
	  */
    public static int[] merge(int[] list1, int[] list2)  {
      int[] mergedList = new int[list1.length + list2.length]; //array of list three equals length of list1 and list2
	  //for loop to assign list1 variables to mergedList
      for (int i = 0; i < list1.length; i++)
        mergedList[i] = list1[i];
      //for loop to assign list2 variables to mergedList
      for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
        mergedList[j] = list2[i];	
      }
      
      sort(mergedList); //call sort method on mergedLsit

      return mergedList;
	}

  /** 
    * sort 
	* sorts a list in ascending order
	*/
  public static void sort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) { //for loop to go through list and find minimum value
      int minimum = list[i];
      int minimumIndex = i;

    for (int j = i + 1; j < list.length; j++) {
      if (list[j] < minimum) { //if current list index is less than minimum value, reassign
        minimum = list[j]; 
        minimumIndex = j; 
      }					
    }
      //if loop to check if minIndex not equal to i variable and to reassign
      if (minimumIndex != i) {
        list[minimumIndex] = list[i];
        list[i] = minimum;
      }
    }
  }
}