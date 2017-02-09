//Michelle Bartolo Lab 2
import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create new Scanner object
	
	System.out.println("Please enter the following as a percentage...");
	
	System.out.println("Midterm exam: ");
	double midterm = input.nextDouble();
	
	System.out.println("Final exam: ");
	double finalexam = input.nextDouble();
	
	System.out.println("Projects: ");
	double projects = input.nextDouble();
	
	System.out.println("Homework and Labs: ");
	double homeworkandlabs = input.nextDouble();
	
	double grade = ((midterm * .2) + (finalexam * .2) + (projects * .2) + (homeworkandlabs * .4));
		
	if (grade >= 95 && grade <= 100) {
	  System.out.println("Your final grade is: A");
	}
	else if (grade >= 90 && grade < 95) {
      System.out.println("Your final grade is: A-");
    }
	else if (grade >= 87 && grade < 90) {
	  System.out.println("Your final grade is: B+");
	}
	else if (grade >= 83 && grade < 87) {
	  System.out.println("Your final grade is: B");
	}
	else if (grade >= 80 && grade < 83){
	  System.out.println("Your final grade is: B-");
	}
	else if (grade >= 77 && grade < 80){
	  System.out.println("Your final grade is: C+");
	}
	else if (grade >= 73 && grade < 77){
	  System.out.println("Your final grade is: C");
	}
	else if (grade >= 70 && grade < 73){
	  System.out.println("Your final grade is: C-");
	}
	else if (grade >= 65 && grade < 70){
	  System.out.println("Your final grade is: D+");
	}
	else if (grade >= 60 && grade < 65){
	  System.out.println("Your final grade is: D");
	}
	else if (grade < 60 ){
	  System.out.println("Your final grade is: F");
	}
	else {
	  System.out.println("Please check that the values you have entered are valid and try again.");
	}
  }
}

	
	