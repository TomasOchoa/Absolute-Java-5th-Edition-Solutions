package tomas.ochoa;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Code Snippet:
 Scanner scan = new Scanner(System.in);
 int n1, n2;
 double r;
 n1 = scan.nextInt();
 n2 = scan.nextInt();
 r = (double) n1 / n2;

OBJECTIVE:
 -Place code into try-catch block
    - Multiple Catches
        - Catch 1:
            Attempted to divide by zero
        - Catch 2:
            String entered (Miss match)
    - If either execptions, loop back for input *
 * */

public class Main
{
    public static void main(String[] args)
    {
    // Code Snippet
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        double r = 0.0;

    // Flag for while loop
        boolean done = false;

        while(!done)
        {
            //begin try block
            try
            {
                // get input
                n1 = scan.nextInt();
                n2 = scan.nextInt();

                // validate
                if(n2 == 0)
                    throw new DivisionByZeroException();
                // do math
                r = (double) n1 / n2;
                done = true;
            }
            // Stuff to do if input mismatch
            catch (InputMismatchException e)
            {
                // skip junk
                scan.nextLine();
                // Prompt then loop back
                System.out.print("Invalid type! Try again:");
            }
            // Stuff to do if division by zero
            catch (DivisionByZeroException e)
            {
                // skip junk
                scan.nextLine();
                // Prompt then loop back
                System.out.print(e.getMessage() + "Try again: ");
            }
        }
        //out of while so print result
        System.out.println(n1 + "/" + n2 + "=" + r);


    }
}
