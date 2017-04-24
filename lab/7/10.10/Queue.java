/**
   * file: Queue.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 27, 2017
   * version: 1.3
   * 
   * This file contains the object, Queue, for the solution for Problem 10.10
   */
public class Queue {
  private int[] elements; //create array of elements
  private int size; //define size as an integer
  private int capacity; //define capacity as an integer

  public Queue(int capacity) {
    this.capacity = capacity; //since it is defined as private, using "this" allows for capacity to be used
    elements = new int[capacity]; //create array called elements with the capacity as the size 
  }

  public Queue() {
    this(8);
  }

  public void enqueue(int v) {
    if (size >= elements.length) {
      int[] temp = new int[size * 2]; //creates array called temp and multiplies size by 2
        System.arraycopy(elements, 0, temp, 0, size); //copies array from the specified source array 
        elements = temp; 
    }
    elements[size++] = v; //increment size and set equal to v
  }

  public int dequeue() {
    int v = elements[0];
    size--; //decrement size
	//for loop to increase size of array until it reaches the specified size
    for (int i = 0; i < size; i++) {
      elements[i] = elements[i + 1];
    }
    return v;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int getSize() {
    return size;
  }

  public int getCapacity() {
    return capacity;
  }
}