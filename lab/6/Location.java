/**
   * file: Location.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 6
   * due date: April 20, 2017
   * version: 1.3
   * 
   * This file contains the objecct for the solution for Problem 9.1
   */
public class Location {
  public int rows; //declare row for number of rows
  public int columns; //declares column for number of columns
  public double maximumValue;

  //construct a Location object
  Location(int rows, int columns, double maximumValue) {
    this.rows = rows; //use this.rows since it is private so it can be identified
    this.columns = columns; //use this.columns since it is private so it can be identified
    this.maximumValue = maximumValue; //use this.maximumValue since it is private so it can be identified
  }

  public static Location locateLargest(double[][] a) {
    int rows = 0; //initilize rows
    int columns = 0; //initilize columns
    double maximumValue = a[rows][columns];

  for (int i = 0; i < a.length; i++) { //for loop for rows
    for (int j = 0; j < a[i].length; j++) { //for loop for columns
      if (maximumValue < a[i][j]) { 
        maximumValue = a[i][j]; 
        rows = i; //rows go into i location
        columns = j; //columns go into j location
      }
    }
  }
    return new Location(rows,columns,maximumValue); //returns the location of the maximum value as well as the actual value
  }
}
