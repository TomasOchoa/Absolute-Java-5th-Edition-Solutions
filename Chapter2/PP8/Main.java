package tomas.ochoa;
import java.util.Scanner;

/**
 * Write a program that reads in a line of text and then outputs that line of text first
 * in all uppercase letters and then in all lowercase letters.
 * */

public class Main
{
    public static void main(String[] args)
    {
	// Variables
        String input;
        String inputUpper;
        String inputLower;
        Scanner keyboard = new Scanner(System.in);

    // Prompt for input
        System.out.print("Enter a line of text: ");
        input = keyboard.nextLine();

    // Store input in all caps
        inputUpper = input.toUpperCase();

    // Store input in all lower
        inputLower = input.toLowerCase();

    // Display in all caps and then lower
        System.out.println("Text in all upper case: " + inputUpper);
        System.out.println("Text in all lower case: " + inputLower);

    }
}
