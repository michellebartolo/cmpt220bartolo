//Michelle Bartolo Lab 1- Problem 2.5 1/25/17
import java.util.Scanner;

public class Problem2_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);	// Create new Scanner object.
    // Prompt the user to enter the subtotal and the gratuity rate
	  System.out.print("Enter the subtotal and a gratuity rate: ");
	  double subtotal = input.nextDouble();
	  double gratuityRate = input.nextDouble();

    // Calculate gratuity and total
      double gratuity = subtotal * (gratuityRate / 100);
      double total = subtotal + gratuity;

    // Display results
      System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
  }
}