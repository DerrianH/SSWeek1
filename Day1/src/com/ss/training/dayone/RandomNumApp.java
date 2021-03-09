/**
 * 
 */
package com.ss.training.dayone;

import java.util.Random;
import java.util.Scanner;

/**
 * Number Guessing game
 * @author derrianharris
 *
 */
public class RandomNumApp {

	/**
	 * Ask the user to guess a number.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Create a Scanner object
	    Random rand = new Random();
	    Integer upperbound = 100;
	    Integer randNum = rand.nextInt(upperbound + 1);
	    Integer guesses = 5;

	    while (guesses > 0) {
	      System.out.println(
	        "Pick a number between 1 - 100. You have " +
	        guesses +
	        (guesses == 1 ? " guess " : " guesses ") + "left"
	      );
	      Integer userInput = 0;
	      try {
	    	  userInput = sc.nextInt();
	      }catch(Exception e) {
	    	  System.out.println("Invalid guess.");
	    	  sc.nextLine();
	    	  continue;
	      };
	      
	      if (userInput >= 0 && userInput < upperbound) {
	  	        if (Math.abs(userInput - randNum) <= 10) {
	  	          System.out.println(
	  	            "Nice Job! Input: " + userInput + " Answer: " + randNum
	  	          );
	  	          break;
	  	        } else {
	  	        	if(guesses > 1) {
	  	        		System.out.println("Try again.");
	  	        	}
	  	          guesses--;
	  	        }
	  	      } else {
	  	        System.out.println("Input out of range");
	  	      }
	  	    
	  	    if(guesses <= 0) {
	  	    	System.out.println("Sorry out of guesses... Answer: " + randNum);
	  	    }
	      

	}

	}
}
