package tomas.ochoa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main
{// Begin main class
    public static void main(String[] args)
    {// Begin main method
        // Null scanner to be able to use
        Scanner fileReader = null;

        // Open file for input
        try
        {
            // Scanner class to read input
            fileReader = new Scanner(new FileInputStream("int.txt"));
        }
        // If file not found
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist.");
        }
        // File error
        catch (IOException e)
        {
            System.out.println("Error occurred");
            System.exit(0);
        }

        // Variables to hold values
        // Start at first value
        int max = fileReader.nextInt();
        int min = max;

        // Methodology: Use loop to sequential search
        while(fileReader.hasNextInt())
        {// Begin while loop

            // Set the next Integer
            int next = fileReader.nextInt();
            //If the next in is higher than the current max, max is = nextInt
            if(next > max)
                max = next;
            // If it is lower than min, min is = nextInt
            if(next < min)
                min = next;

        }// end while loop

        // Print out the results
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

    }// End main method
}// End main class
