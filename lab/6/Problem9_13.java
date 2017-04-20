import java.util.Scanner;

public class Problem9_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns in the array: "); //prompts the user to enter the number of rows and columns in the array
    
	int rows = input.nextInt(); //Allows the user to input the number of rows
    int columns = input.nextInt(); //Allows the user to enter the number of columns
    double[][] arrayInputted = new double[rows][columns]; //Puts the inputed value of rows/columns into an array

    System.out.println("Enter the array:"); //Prompts users to enter an array
    for (int i = 0; i < arrayInputted.length; i++) { //for loop to increment the location of number in row
      for (int j = 0; j < arrayInputted[i].length; j++) { //for loop to increment the location of number in column
        arrayInputted[i][j] = input.nextDouble(); //allows user to input numbers into an array
      }
    }

    Location location = Location.locateLargest(arrayInputted); //Calls the object created to find where the largest value is located
    System.out.println("The largest element is located "
        + location.maximumValue + " at (" + location.rows + ", " + location.columns + ")"); //Prints the location where the largest value is located
    }
}