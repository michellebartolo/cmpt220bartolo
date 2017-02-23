//Michelle Bartolo- Lab 3- Problem 5.7- 2/22/17

//**5.7 (Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and increases 5% every year. 
//In one year, the tuition will be $10,500. Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition
//after the tenth year.

public class Problem5_7 {
  public static void main(String[] args) {
	
	//declare variables
	double tuition = 10000.00;
    int year = 0;
    double sum = 0;
    
    //for loop to increment price over 10 years
    for (year = 1; year < 14; year++){
      tuition += tuition * .05; //tuition equals itself plus itself times .05
      double roundtuition = (Math.round(tuition * 100.0) / 100.0); //round to tens place
     if (year == 9){ //if loop to end iterations for year price
      System.out.println("The tuition in 10 years will be $" + roundtuition) ; 
    }
     if (year > 9 && year < 14){ //if loop for incrementing full tuition
       sum += roundtuition; //accumulate sum by adding sum to tuition 
     }
    }
    System.out.println("The total four year tuition after 10 years is $" + sum); //print out the sum of the total four year tuition after 10 years
  }
}