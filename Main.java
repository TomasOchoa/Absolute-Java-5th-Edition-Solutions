package tomas.ochoa;

import java.util.Locale;
import java.util.Scanner;

/**
 *  Write a program that starts with the string variable first set to your first name
 * and the string variable last set to your last name. Both names should be all lowercase.
 * Your program should then create a new string that contains your full name in
 * pig latin with the first letter capitalized for the first and last name. Use only the pig
 * latin rule of moving the first letter to the end of the word and adding “ay.” Output
 * the pig latin name to the screen. Use the substring and toUpperCase methods
 * to construct the new name.
 *
 * For example,
 * given first = "walt";
 * last = "savitch";
 *
 * the program should create a new string with the text “Altway Avitchsay” and print it.
 *
 *
 * - First = first name
 * - last = last name
 * */

public class Main
{
    public static void main(String[] args)
    {
    // String variables to hold names
        String first;
        String last;
        String pigFirst;
        String pigLast;

    // Keyboard scanner
        Scanner keyboard = new Scanner(System.in);

    // Prompt user for Full name first and last
        System.out.print("Please enter your first and last name (In that order in lowercase): ");
        first = keyboard.next();
        last = keyboard.next();

    // Use piglatin rule (Use only the pig latin rule of moving the first letter to the end of the word and adding “ay.”)
        pigFirst = first.substring(1,2).toUpperCase();
        pigLast = last.substring(1,2).toUpperCase();

        //          'O'             "mas"
        pigFirst = pigFirst + first.substring(2);
        //          'C'             "hoa"
        pigLast = pigLast + last.substring(2);

    // Now add ay to both
        pigFirst += "ay";
        pigLast += "ay";

    // Store in new string
        String pigName = pigFirst + " " + pigLast;

    // Print results
        System.out.println("Your name in pig latin is " + pigName);


    //


    }
}
