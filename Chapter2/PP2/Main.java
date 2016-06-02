package tomas.ochoa;

import java.util.Scanner;

/**
 * (This is a version with input of an exercise from Chapter 1 .) Write a program that
 * inputs two string variables, first and last, which the user should enter with his or
 * her name. First, convert both strings to all lowercase. Your program should then create
 * a new string that contains the full name in pig latin with the first letter capitalized
 * for the first and last name. Use only the pig latin rule of moving the first letter to the
 * end of the word and adding “ay.” Output the pig latin name to the screen. Use the
 * substring and toUpperCase methods to construct the new name.
 *
 * For example, if the user inputs “Walt” for the first name and “Savitch” for the
 * last name, then the program should create a new string with the text “Altway
 * Avitchsay” and print it.
 *
 * */

public class Main
{

    public static void main(String[] args)
    {
    // Variables
        String first;
        String last;
        String pigFirst;
        String pigLast;

    // Scanner for input
        Scanner keyboard = new Scanner(System.in);

    //Prompt user for input
        System.out.print("Please enter your first and last name: ");
        first = keyboard.next();
        last = keyboard.next();
        System.out.println("Your name: " + first + " " + last);

    //Convert to lower case
        first = first.toLowerCase();
        last = last.toLowerCase();

    // Move first to last and add ay
        pigFirst = first.substring(1) + first.substring(0,1) + "ay";
        pigLast = last.substring(1) + last.substring(0,1) + "ay";

    // Capitalize first letter of names
        pigFirst = pigFirst.substring(0,1).toUpperCase() + pigFirst.substring(1);
        pigLast = pigLast.substring(0,1).toUpperCase() + pigLast.substring(1);

    // Print results
        System.out.println("Your name in pig latin: " + pigFirst + " " + pigLast);

    }
}
