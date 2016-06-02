package tomas.ochoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        int input;
        String plural = "bottles";

        // Scanner to read input
        Scanner keyboard = new Scanner(System.in);

        // Asl for input
        System.out.print("Enter a number: ");
        input = keyboard.nextInt();

        // Anything over 99 is set to 99 anyting under 0 is set to 0
        BeerSong Singer = new BeerSong(input);
        if (input > 99)
            input = 99;
        else if (input < 0)
            input = 0;

        // Write the song
        while (input > 0)
        {
            // There is one bottle of beer not bottles
            if(input == 1)
                plural = "bottle";

            System.out.println(Singer.printNumber(input) + " " + plural + " of beer on the wall,");
            System.out.println(Singer.printNumber(input) + " " + plural + " of beer,");
            System.out.println("Take one down pass it around,");

            //Take one down a
            input = input - 1;

            if(input == 0)
                plural = "bottles";
            else if(input == 1)
                plural = "bottle";

            System.out.println(Singer.printNumber(input) + " " + plural + " of beer on the wall.\n");
        }
    }
}
