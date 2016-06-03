package tomas.ochoa;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Tom's Desktop on 4/7/2016.
 */
public class FileNumbers
{
    // Instance Variables
    private String fileName;

    // Constructors
    // Default
    public FileNumbers()
    {
        fileName = "";
    }

    // With file name
    public FileNumbers(String name)
    {
        fileName = name;
    }

// Accessors
    // Method to open and calc average of file
    public double getAvg()
    {
        // variables
        double total = 0.0;
        double avg = 0.0;
        int count = 0;
        Scanner fileInput = null;

        //open file
        try
        {
            fileInput = new Scanner(new FileInputStream(fileName));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error. File not found.");
        }
        catch(IOException e)
        {
            System.out.println("Fatal error");
            System.exit(0);
        }

        // while there are double numbers
        while(fileInput.hasNextDouble())
        {
            double next = fileInput.nextDouble();
            total+=next;
            count++;
        }

        // calculate average
        avg = total/count;
        NumberFormat formatter = new DecimalFormat("#.00");
        System.out.println(String.format("Average of numbers of type double in file: " + formatter.format(avg)));

        // close file
        fileInput.close();

        // return average
        return avg;
    }

    // Method to open and calc standard deviation
    public double getStdDev()
    {
        // variables
        double avg = 0.0;
        double stdDev = 0.0;
        double total = 0.0;
        double a = getAvg();
        int count = 0;
        Scanner fileInput = null;

        //open file
        try
        {
            fileInput = new Scanner(new FileInputStream(fileName));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: File not found.");
        }
        catch(IOException e)
        {
            System.out.println("Fatal Error.");
            System.exit(0);
        }

        // while there are sill double numbers
        while(fileInput.hasNextDouble())
        {
            double next = fileInput.nextDouble();
            total += (next - a) * (next - a);
            count ++;
        }

        // Calculate Std Dev
        avg = total/count;
        stdDev = Math.sqrt(avg);

        //close file
        fileInput.close();

        // return value
        return stdDev;
    }
}
