package co.grandcircus;

import java.util.Scanner;

/*
 * Your goal: Determine what a user should wear based on the 
 * type of event they're attending and the temperature outside.
 * 
 * Options: 
 * eventType should be used as a condition for eventClothing
 *  casual = something comfy
 *  semi-formal = business casual or a polo
 *  formal = a suit
 *  
 * temperature should be used as a condition for tempClothing 
 *  temperature < 54 = a coat
 *  temperature > 74 = no jacket
 *  temperature between 54 and 74 = a jacket
 *  
 *  Bonus Challenge: Ask the user if they would like to continue and go again
 */
public class CodeChallenge {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	double temperature = 0.0;
	String eventType, tempClothing, eventClothing;
//	boolean userHasQuit = false;

	// do {
	System.out.println("What type of event are you going to be attending?");
	eventType = scan.next();

	// Garbage collection
	scan.nextLine();
	if (eventType.equalsIgnoreCase("casual")) {
	    eventClothing = "something comfy";
	} else if (eventType.equalsIgnoreCase("semi-formal")) {
	    eventClothing = "business casual or a polo";
	} else if (eventType.equalsIgnoreCase("formal")) {
	    eventClothing = "a suit";
	} else {
	    System.out.println("Please enter a valid event type.");
	    scan.close();
	    return;
	}

	System.out.println("What will the weather be like at your event?");
	temperature = scan.nextDouble();

	if (temperature < 54) {
	    tempClothing = "a coat";
	} else if (temperature > 74) {
	    tempClothing = "no jacket";
	} else {
	    tempClothing = "a jacket";
	}

	System.out.println("Since you are attending a " + eventType + " event and the temperature is " + temperature
		+ " degrees outside you should wear " + eventClothing + " and " + tempClothing + ".");

//	System.out.println("Continue? (y/n)");

	// } while (!userHasQuit);

	scan.close();

    }

}