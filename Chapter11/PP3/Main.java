/**
 * Consider a frame of bowling pins shown below, where each * represents a pin:
    *
   * *
  * * *
 * * * *
* * * * *
 There are 5 rows and a total of 15 pins.
 If we had only the top 4 rows, then there would be a total of 10 pins.
 If we had only the top three rows, then there would be a total of six pins.
 If we had only the top two rows, then there would be a total of three pins.
 If we had only the top row, then there would be a total of one pin.

 Write a recursive function that takes as input the number of rows n and outputs
 the total number of pins that would exist in a pyramid with n rows. Your program
 should allow for values of n that are larger than 5.
 * */
package tomas.ochoa;

public class Main
{
    // Recursive function to get total number of pins in a given row
    public static int pins(int n)
    {
        // Get number of pins recursively
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return (n + pins(n -1));
    }

    public static void main(String[] args)
    {
	// test recursive function
        int rows = 1;

        System.out.println(pins(rows));

    }
}
