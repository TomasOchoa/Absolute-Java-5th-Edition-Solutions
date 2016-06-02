/**
 * In the game of craps, a pass line bet proceeds as follows: Two six-sided dice are
 * rolled; the first roll of the dice in a craps round is called the “come out roll.”
 * A come out roll of 7 or 11 automatically wins, and a come out roll of 2, 3, or 12
 * automatically loses. If 4, 5, 6, 8, 9, or 10 is rolled on the come out roll, that number
 * becomes “the point.” The player keeps rolling the dice until either 7 or the point is
 * rolled. If the point is rolled first, then the player wins the bet. If a 7 is rolled first,
 * then the player loses.
 *
 * Write a program that simulates a game of craps using these rules without human
 * input. Instead of asking for a wager, the program should calculate whether the
 * player would win or lose. The program should simulate rolling the two dice and
 * calculate the sum. Add a loop so that the program plays 10,000 games. Add
 * counters that count how many times the player wins, and how many times the
 * player loses. At the end of the 10,000 games, compute the probability of winning
 * [i.e., Wins / (Wins + Losses)] and output this value. Over the long run, who
 * is going to win the most games, you or the house?
 *
 *
 * */

package tomas.ochoa;

import java.util.Random;
import java.util.Scanner;

public class Main
{
// Bool flags for win or loose (globals)
    final static boolean WIN = true;
    final static boolean LOOSE = true;

    public static void main(String[] args)
    {
    // Neccessary Variables
        // bool flag to check if playerWon
        boolean didPlayerWin;
        // Dices
        int dice1 = 0;
        int dice2 = 0;
        // ROlls
        int comeOutRoll = 0;
        int thePoint = 0;
        int secondRoll = 0;
        // counters
        int winCount = 0;
        int looseCount = 0;
        // summs
        int rollSum = 0;
        // Percentage
        double winChance = 0.0;
        // scanner for input
        Scanner keyboard = new Scanner(System.in);
        // Random number generator for the dice rolls
        Random rollDice = new Random(7);

    // Prompt user for input
        for(int i = 0;i <= 100;i++)
        {
        //Roll two dices and add rolls
            dice1 = rollDice.nextInt(6) + 1;
            dice2 = rollDice.nextInt(6) + 1;
            rollSum = dice1+dice2;

        // if 7 or 11, win
        // Else if 2, 3, or 12
        // Else  roll = the point and keep rolling until 7 or point
            if ((rollSum == 7) || (rollSum == 11))
            {
                didPlayerWin = WIN;
                winCount++;
                System.out.println("Win!");
            }
            else if ((rollSum == 2) || (rollSum == 3) || (rollSum == 12))
            {
                didPlayerWin = LOOSE;
                looseCount++;
                System.out.println("Loose!");
            }
            else
            {
                rollSum = thePoint;
                // do while loop to keep doing until 7 or l1
                // start while loop
                do
                {
                    dice1 = rollDice.nextInt(6) + 1;
                    dice2 = rollDice.nextInt(6) + 1;
                    rollSum = dice1 + dice2;

                    // if roll = 7 loose
                    // if roll = "thePoint", win
                    // else roll again
                    if (rollSum == 7)
                    {
                        looseCount++;
                        System.out.println("Loose!");
                    }
                    else if (rollSum == thePoint)
                    {
                        winCount++;
                        System.out.println("Win!");
                    }
                    else
                    {
                        rollSum = dice1 + dice2;
                        secondRoll = rollSum;
                    }

                // end while loop
                }while ((rollSum != 7)||(rollSum != rollSum));
            }






        //Print roll
            // System.out.println("Roll: " + rollSum);
        }





    }
}
