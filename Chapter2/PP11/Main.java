package tomas.ochoa;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Write a program that calculates the total grade for three classroom exercises as a
 * percentage. Use the DecimalFormat class to output the value as a percent. The
 * scores should be summarized in a table. Input the assignment information in this
 * order: name of assignment (may include spaces), points earned (integer), and total
 * points possible (integer). The percentage is the sum of the total points earned divided
 * by the total points possible. Sample input and output is shown as follows:
 *
 * Name of exercise 1:
 * Group Project
 * Score received for exercise 1:
 * 10
 * Total points possible for exercise 1:
 * 10
 *
 * Name of exercise 2:
 * Homework
 * Score received for exercise 2:
 * 7
 * Total points possible for exercise 2:
 * 12
 *
 *
 * Name of exercise 3:
 * Presentation
 * Score received for exercise 3:
 * 5
 * Total points possible for exercise 3:
 * 8
 *
 * Exercise         Score       Total Possible
 * Group Project    10          10
 * Homework         7           12
 * Presentation     5           8
 * Total            22          30
 *
 * Your total is 22 out of 30, or 73.33%.
 *
 * */

public class Main
{
    public static void main(String[] args)
    {
	// Assignment names
        String assignment1;
        String assignment2;
        String assignment3;

    // Assignment scores
        int score1;
        int score2;
        int score3;

    // Assignment possible scores
        int points1;
        int points2;
        int points3;

    // percentage
        int total;
        int outOf;
        double percent;

    // SCanner for input
        Scanner keyboard = new Scanner(System.in);

    // Prompt user for input for assignments
        // Assignment 1
        System.out.print("Name of exercise 1: ");
        assignment1 = keyboard.nextLine();
        System.out.print("Score received for exercise 1: ");
        score1 = keyboard.nextInt();
        System.out.print("Total points possible for exercise 1: ");
        points1 = keyboard.nextInt();
        keyboard.nextLine();

        // Assignment 2
        System.out.print("\nName of exercise 2: ");
        assignment2 = keyboard.nextLine();
        System.out.print("Score received for exercise 2: ");
        score2 = keyboard.nextInt();
        System.out.print("Total points possible for exercise 2: ");
        points2 = keyboard.nextInt();
        keyboard.nextLine();

        // Assignment 3
        System.out.print("\nName of exercise 3: ");
        assignment3 = keyboard.nextLine();
        System.out.print("Score received for exercise 3: ");
        score3 = keyboard.nextInt();
        System.out.print("Total points possible for exercise 3: ");
        points3 = keyboard.nextInt();
        keyboard.nextLine();

    // Do calculations
        total = score1 + score2 + score3;
        outOf = points1 + points2 + points3;
        percent = ((double) total)/outOf * 100;
        DecimalFormat Percent = new DecimalFormat("##.##");

    // Display results with format
        System.out.printf("%-25s%-15s%-15s%n","Exercise","Score","Total Possible");
        System.out.printf("%-25s%-15d%-15d%n",assignment1,score1,points1);
        System.out.printf("%-25s%-15d%-15d%n",assignment2,score2,points2);
        System.out.printf("%-25s%-15d%-15d%n",assignment3,score3,points3);
        System.out.println("\n Your total is " + total + " out of " + outOf + ", or " + Percent.format(percent) + "%");





    }
}
