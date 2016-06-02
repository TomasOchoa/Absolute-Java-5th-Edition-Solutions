package tomas.ochoa;

import java.util.Scanner;

/**
 *  Write a program that starts with a line of text and then outputs that line of text
 * with the first occurrence of "hate" changed to "love". For example, a possible
 * sample output might be
 *
 * The line of text to be changed is:
 * I hate you.
 * I have rephrased that line to read:
 * I love you.
 *
 *  You can assume that the word "hate" occurs in the input. If the word "hate"
 * occurs more than once in the line, your program will replace only the first occurrence of "hate".
 * Since we will not discuss input until Chapter 2 , use a defined
 * constant for the string to be changed. To make your program work for another
 * string, you should only need to change the definition of this defined constant.
 *
 * */

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        String hate = "hate";
        String love = "love";
        String input;
        String inputChanged;
        int hateIndex;

        //prompt user and ask for text phrase with "hate"
        System.out.print("Please enter a text phrase with the word \"hate\": ");
        input = keyboard.nextLine();

        //Find first occurrence;
        if ((input.indexOf(hate) == -1))
            System.out.println("Nothing is to be changed.");
        else
        {
        //Change it
            hateIndex = input.indexOf(hate);
            inputChanged = input.substring(0, hateIndex) + "love" + input.substring(hateIndex+4);
        //Output it
            System.out.println("The line of text to be changed is: " + input + "\n" +
                               "I have rephrased that line to read: " + inputChanged);
        }







    }
}
