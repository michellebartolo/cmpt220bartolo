/**
   * file: Problem6_8.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 7, 2017
   * version: 1.3
   * 
   * This file contains the solution to Problem 6.8 which asks to write a class that contains methods
   * to convert celsius to fahrenheit and fahrenheit to celsius and display results in a table
   */
public class Problem6_8 {
  public static void main(String[] args){
	double fahrenheit = 120.0; //initialize fahrenheit to 120.0 because that is what the table starts at
	double celsius = 40.0; //initialize celsius to 40.0 because that is what the table starts at
	//prints out the header for the table to format it
    System.out.println("Celsius        Fahrenheit      |        Fahrenheit        Celcius");
    System.out.println("-------------------------------------------------------------------");
    
    //create a for loop to format the table and display values of the temperature conversions
    for(int i=0; i<=10; i++){
      //calls the two methods to print out the conversions while properly spacing and rounding to tenths place
      System.out.printf("%.1f %15.1f           |%15.1f %15.1f\n" , celsius, celsiusToFahrenheit(celsius), 
          fahrenheit, fahrenheitToCelsius(fahrenheit));
      celsius = celsius - 1.0; //decrement celsius by 1 each time
      fahrenheit = fahrenheit - 10.0;  //decrement fahrenheit by 10 each time
     }
   }
    
  /*
   * celsiusToFahrenheit
   * Converts from celsius to fahrenheit
   */
  public static double celsiusToFahrenheit(double celsius){
    double fahrenheit = 120.0; //initialize fahrenheit variable
    fahrenheit = (9.0 / 5) * celsius + 32; //formula for converting celsius to fahrenheit
    return fahrenheit;
  }
  /*
   * fahrenheitToCelsius
   * Converts from fahrenheit to celsius
   */
  public static double fahrenheitToCelsius(double fahrenheit){
    double celsius = 40.0; //initializes celsius value
    celsius = (5.0 / 9) * (fahrenheit - 32); //formula for converting fahrenheit to celisus
    return celsius;
  }
}