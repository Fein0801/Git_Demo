package co.grandcircus;

import java.util.Scanner;

public class IfElsePractice {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	// Ask user for a grade
	System.out.println("Please enter your score: ");

	// Consume number and assign it to a grade variable
	int grade = scan.nextInt();

	// Check to see if grade is in a certain range
	// print grade to console
	if (grade <= 100 & grade >= 0) {
	    if (grade >= 85) {
		System.out.println("A");
	    } else if (grade >= 71) {
		System.out.println("B");
	    } else if (grade >= 61) {
		System.out.println("C");
	    } else if (grade >= 51) {
		System.out.println("D");
	    } else {
		System.out.println("F");
	    }
	} else {
	    System.out.println("Invalid score. Grade must be between 0 and 100.");
	}

	// End code here
	scan.close();
    }
}
