//Michelle Bartolo Lab 1- Gradecalculator 1/25/17
import java.util.Scanner;

public class Gradecalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create new Scanner object
	
	System.out.println("Please enter the following as a percentage...")
	
	System.out.println("midterm exam: ");
	double midterm = input.nextDouble();
	
	System.out.println("final exam: ");
	double finalexam = input.nextDouble();
	
	System.out.println("projects: ");
	double projects = input.nextDouble();
	
	System.out.println("homework and labs: ");
	double homeworkandlabs = input.nextDouble();
	
	double calculate = ((midterm * .2) + (finalexam * .2) + (projects * .2) + (homeworkandlabs * .4));
	System.out.println("Your final grade is: " + calculate);
  }
}

	
	