/**
   * file: Problem10_10.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 27, 2017
   * version: 1.3
   * 
   * This file contains the test class for Problem 10.10
   */
public class Problem10_10 {
  public static void main(String[] args) {

  Queue queue = new Queue();
  
  // inserts 20 numbers into queue
  for (int i = 0; i < 20; i++) {
    queue.enqueue(i);
  }

  // displays 20 numbers first in first out basis (queue)
  for (int i = 0; i < 20; i++) {
    System.out.printf("%2d ", queue.dequeue()); 
    if ((i + 1) % 5 == 0) System.out.printf("\n");
    }
  }
}