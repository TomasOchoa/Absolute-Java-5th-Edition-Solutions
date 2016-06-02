package tomas.ochoa;

import java.util.Scanner;
/**
 * Created by Tom's Desktop on 3/8/2016.
 *
 * Programming Project 1
 *
 * Write a program that outputs the lyrics for “Ninety-nine Bottles of Beer on the
 * Wall.” Your program should print the number of bottles in English, not as a number. For example,
 *
 * Ninety-nine bottles of beer on the wall,
 * Ninety-nine bottles of beer,
 * Take one down, pass it around,
 * Ninety-eight bottles of beer on the wall.
 * ...
 * One bottle of beer on the wall,
 * One bottle of beer,
 * Take one down, pass it around,
 * Zero bottles of beer on the wall.
 *
 * Your program should not use ninety-nine output statements!
 * Design your program with a class named BeerSong whose constructor takes an
 * integer parameter that is the number of bottles of beer initially on the wall. If
 * the parameter is less than zero, set the number of bottles to zero. Similarly, if the
 * parameter is greater than 99, set the number of beer bottles to 99. Then make
 * a public method called printSong that outputs all stanzas from the number of
 * bottles of beer down to zero. Add any additional private methods you find helpful.
 */


public class BeerSong
{
    // 1 arg constructor
    public BeerSong(int i)
    {
        printNumber(i);
    }
    // ---------- Member methods -----------
    public String getOnes(int i)
    {
        switch (i)
        {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 0:
                return "Zero";
            default:
                return "Error!";
        }
    }

    public String getTeens(int i)
    {
        switch (i)
        {
            case 0:
                return "Ten";
            case 1:
                return "Eleven";
            case 2:
                return "Twelve";
            case 3:
                return "Thirteen";
            case 4:
                return "Fourteen";
            case 5:
                return "Fifteen";
            case 6:
                return "Sixteen";
            case 7:
                return "Seventeen";
            case 8:
                return "Eighteen";
            case 9:
                return "Nineteen";
            default:
                return "Error!";
        }
    }

    public String getTens(int i)
    {
        switch (i)
        {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
            default:
                return "Error!";
        }
    }

    public String printNumber(int i)
    {
    // Tens and Ones places
        int tens = i/10;
        int ones = i%10;

        if (i > 9)
        {
            if(tens == 1)
                return getTeens(ones);
            else if(ones == 0)
                return getTens(i/10);
            else
                return getTens(tens) + '-' + getOnes(ones);
        }
        else
            return getOnes(ones);
    }
}
