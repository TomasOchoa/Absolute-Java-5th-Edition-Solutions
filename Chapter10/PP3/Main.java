package tomas.ochoa;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 Write a program that takes its input from a text file of strings representing numbers
 of type double and outputs the average of the numbers in the file to the screen. The
 file contains nothing but strings representing numbers of type double, one per line

 ALGORITHM

 START MAIN
    scanner for input = null
    double total = 0
    double avg = 0
    int count = 0

    START TRY
        open file
    END TRY
    START CATCH (file not found)
        print message "error"
    END CATCH

    total = nextDouble

    START WHILE(hasDouble)
        next = nextDouble
        total += next
        count++
    END WHILE

    double avg = total/count
    print results
 END MAIN

 */

public class Main
{// start Main class
    public static void main(String[] args)
    {//start main method
        // Variables to hold values
        double total = 0.0;
        double avg = 0.0;
        int count = 0;

        // Scanner for file input
        Scanner fileInput = null;

        try
        {
            fileInput = new Scanner(new FileInputStream("doubleNumbers.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error. File not found.");
        }
        catch (IOException e)
        {
            System.out.println("Fatal error.");
            System.exit(0);
        }

        while(fileInput.hasNextDouble())
        {// start while
            double next = fileInput.nextDouble();
            total+=next;
            count++;
        }// end while

        avg = total/count;
        NumberFormat formatter = new DecimalFormat("#.00");
        System.out.println(String.format("Average of numbers of type double in file: " + formatter.format(avg)));

    }//end main method
}// end Main class
