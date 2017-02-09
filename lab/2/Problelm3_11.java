//Michelle Bartolo Lab 2
//Problem 3.11 (Find the number of days in a month) 
//Write a program that prompts the user
//to enter the month and year and displays the number of days in the month. For
//example, if the user entered month 2 and year 2012, the program should display
//that February 2012 had 29 days. If the user entered month 3 and year 2015, the
//program should display that March 2015 had 31 days.

import java.util.Scanner;
public class MonthDay {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
    //Prompts the user to enter the number of a month
	System.out.println("Enter the number of a month: ");
	int month = input.nextInt();

	//Prompts the user to enter a year
	System.out.println("Enter a year: ");
	int year = input.nextInt();

	//switch statement, matches the month number and year that the user inputted to the amount of days in the that month
	switch (month) {
	  case 1: System.out.println("In " + year +", January has 31 days."); break;
	  case 2: 
	    //Every 4 years, February has 29 days. The if else statement allows this fact to be displayed depending on the year the user inputs 
	    if (year % 4 == 0) {
	      System.out.println("In " + year +", Febraury has 29 days.");
	    }
	    else {
		  System.out.println("In " + year +", Febraury has 282 days.");
	    }
	  break;
	  case 3: System.out.println("In " + year +", March has 31 days."); break;
	  case 4: System.out.println("In " + year +", April has 30 days."); break;
	  case 5: System.out.println("In " + year +", May has 31 days."); break;
	  case 6: System.out.println("In " + year +", June has 30 days."); break;
	  case 7: System.out.println("In " + year +", July has 31 days."); break;
	  case 8: System.out.println("In " + year +", August has 31 days."); break;
	  case 9: System.out.println("In " + year +", September has 30 days."); break;
	  case 10: System.out.println("In " + year +", October has 31 days."); break;
	  case 11: System.out.println("In " + year +", November has 30 days."); break;
	  case 12: System.out.println("In " + year +", December has 31 days.");
	}
  }
}