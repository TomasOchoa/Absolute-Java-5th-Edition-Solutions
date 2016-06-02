package tomas.ochoa;

import java.util.Scanner;

/**
 * (This is a better version of an exercise from Chapter 1 .) A government research lab
 * has concluded that an artificial sweetener commonly used in diet soda pop causes
 * death in laboratory mice. A friend of yours is desperate to lose weight but cannot
 * give up soda pop. Your friend wants to know how much diet soda pop it is possible to
 * drink without dying as a result. Write a program to supply the answer. The
 * input to the program is the amount of artificial sweetener needed to kill a mouse,
 * the weight of the mouse, and the desired weight of the dieter. Assume that diet
 * soda contains 1/10th of 1% artificial sweetener. Use a named constant for this
 * fraction. You may want to express the percent as the double value 0.001.
 *
 * */

public class Main
{
    final static double ARTIFICAL_SWEETNER = 0.001;

    public static void main(String[] args)
    {// Variables
        double mLethalDose;
        double mWeight;
        double targetWeight;
        double dietSodaOK;

    // Scanner for input
        Scanner keyboard = new Scanner(System.in);

    // Prompt user for input
        System.out.print("Please enter lethal dose of artificial sweetener for mouse: ");
            mLethalDose = keyboard.nextDouble();
        System.out.print("Please enter weight of mouse: ");
            mWeight = keyboard.nextDouble();
        System.out.print("Please enter your desired weight: ");
            targetWeight = keyboard.nextDouble();

    // Do calculations
        dietSodaOK = (mLethalDose/mWeight) * targetWeight/ARTIFICAL_SWEETNER;

    // Print results
        System.out.println("Allowed liters of diet soda: " + dietSodaOK);

    }
}
