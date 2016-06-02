package tomas.ochoa;
import java.util.Scanner;

/**
 * The video game machines at your local arcade output coupons according to how
 * well you play the game. You can redeem 10 coupons for a candy bar or 3 coupons
 * for a gumball. You prefer candy bars to gumballs. Write a program that defines a
 * variable initially assigned to the number of coupons you win. Next, the program
 * should output how many candy bars and gumballs you can get if you spend all of
 * your coupons on candy bars first, and any remaining coupons on gumballs.
 *
 * candybar = 10 coupons
 * gumball = 3
 *
 */
public class CouponOptimizer
{
    public static void main(String[] args)
    {
        // For calculating
        int candyBar = 10;
        int gumBall = 3;
        int numCandyBars = 0;
        int numOfGumBalls = 0;

        // For input
        Scanner keyboard = new Scanner(System.in);

        // Request Input
        System.out.print("Enter amount of coupons won: ");
        int coupons = keyboard.nextInt();

        // Calculate shit
        numCandyBars = coupons/candyBar;
        numOfGumBalls = (coupons%candyBar) / gumBall;

        System.out.println(coupons + " can get you " + numCandyBars + " candy bars and " + numOfGumBalls + " gumballs.");
    }
}
