 /**
   * file: Problem3_15.java
   * author: Michelle Bartolo
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains the solution the Problem 3.15, which asks to revise Listing 3.8, Lottery.java, to generate a lottery of a
   * three digit number.
   */

import java.util.Scanner;
public class Problem3_15 {
  public static void main(String[] args) {
 
    // Generate a lottery number
    int lottery = (int)(Math.random() * 1000);

    // Prompt the user to enter a guess
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();

    // Get digits from lottery
    int lotteryDigit1 = lottery / 100;
    int lotteryDigit2 = (lottery / 10) % 10;
    int lotteryDigit3 = lottery % 10;

    // Get digits from guess
    int guessDigit1 = guess / 100;
    int guessDigit2 = (guess / 10) % 10;
    int guessDigit3 = guess % 10;

    System.out.println("The lottery number is " + lottery);
    
    // Check the guess
    if (guess == lottery)
      System.out.println("Exact match: you win $10,000");
    else if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2){
      System.out.println("Match all digits: you win $3,000"); 
    }
    else if (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1){
      System.out.println("Match all digits: you win $3,000"); 
    }
    else if (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2){
      System.out.println("Match all digits: you win $3,000"); 
    }
    else if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2){
      System.out.println("Match all digits: you win $3,000"); 
    }
    else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1){
      System.out.println("Match all digits: you win $3,000"); 
    }
    else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 || 
        guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 || 
        guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3 ){
      System.out.println("Match one digit: you win $1,000");
    }
    else{
      System.out.println("Sorry, no match");
    }
  }
}
