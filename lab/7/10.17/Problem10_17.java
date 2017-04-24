/**
   * file: Problem10_17.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 27, 2017
   * version: 1.3
   * 
   * This file contains the solution for Problem 10.17
   */
import java.math.BigDecimal;

public class Problem10_17 {
  public static void main(String[] args) {
    BigDecimal MaxValue = new BigDecimal(Long.MAX_VALUE);
    long start = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal n = new BigDecimal(start); //declare n bi decimal
    int count = 0; //declare and initialize count

    //while loop executes until n is equal to 10
    while (count < 10) {
      BigDecimal squared = n.multiply(n); //multiplies n by n, n squared
      if (squared.compareTo(MaxValue) > 0) {
        count++; //increment count
        System.out.println(count+": " + n + " squared = " + squared); //print the value of n squared
      }
      n = n.add(BigDecimal.ONE); //adds n and value
    }
  }
}  
