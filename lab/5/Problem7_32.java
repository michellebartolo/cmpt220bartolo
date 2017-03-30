/**
  * file: Problem7_32.java
  * author: Michelle Bartolo
  * course: CMPT 220
  * assignment: Lab 5
  * due date: March 30, 2017
  * version: 1.3
  * 
  * This file contains the solution for problem 7.32 which asks to write a method that partitions 
  * the list using the first element, called a pivot.
  */


import java.util.Scanner;

public class Problem7_32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      
    System.out.print("Enter list: ");
     
    int[] listArray = new int[input.nextInt()]; //array to hold list
    //for loop to assign contents of array
    for (int i = 0; i < listArray.length; i++) {
      listArray[i] = input.nextInt();
    }
   
    partition(listArray); //call partition method on list1
   
    System.out.print("After the partition, the list is ");
    //print out contents with for loop
    for (int i = 0; i < listArray.length; i++) { 
      System.out.print(listArray[i] + " ");
    }
  }
  
  /**
    * partition
    * create method to partition the inputted list
    */
  public static int partition(int[] list) {
    int partition = list[0]; //set partition to 0
    int Location = 0; //location to 0 
    int high = list.length-1; //declare high variable 
   //while loop to check if location is less than high
    while(Location < high) {
      if(partition > list[Location + 1]) { //if loop to check if partition is greater than list at index location
        //swap partition and the next item
        list[Location] = list[Location + 1];
        list[Location + 1] = partition;
        Location++;
      }
      else {
        //move the item to the end of the list
        int temp = list[high];
        list[high]=list[Location + 1];
        list[Location + 1] = temp;
        high--;
      }
    }
      return Location;
  }
}