package tomas.ochoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * In Diving:
 *      - 7 Judges
 *          - Each award a score between 0-10
 *              - Each score can be a floating point value
 *              - Highest and lowest scores are thrown out
 *              - Remaining scores are added together
 *                  - Sum then multiplied by degree of dificulty for that dive
 *                      - Degree of difficulty range from 1.2 to 3.8
 *              - Total is then multiplied by 0.6 to determine the diver's score
 *
 *  Program:
 *      - Inputs a degree of difficulty
 *      - Inputs the 7 judges scores
 *      - Outputs the overall score for that drive
 *      NOTE: Program should ensure that all inputs are withing the allowable ranges
 */
public class DiveScore
{
    // Create an array lust of type double to store the dive scores
    public ArrayList<Double> scores = new ArrayList<Double>();
    public double difficulty; // to read difficulty level

    /**
     * Helper method to calculate the score of the dive, given the average
     * score from the judges and the difficulty of the dive.
     * */
    public double getDiveScore()
    {
        // Sort the list first, then throw out the lowest and largest scores
        // Using the collections class
        Collections.sort(this.scores);

        // Remove the lowest score
        this.scores.remove(0);      // When sorted index 0 contains lowest

        // Remove highest
        this.scores.remove(this.scores.size() - 1);

        // Get the sum of the scores
        double sum = 0;
        for(int i = 0; i < this.scores.size();i++)
        {
            sum += this.scores.get(i);
        }

        // Multiply the sum of the scores by the degree of difficulty
        sum = sum * difficulty;

        // Return the sum which would be the score before multiplying 0.6

        return sum * 0.6;
    }

    public static void main (String args[])
    {
        // For input
        Scanner keyboard = new Scanner(System.in);
        double input = 0.0;

        // Object for dive score
        DiveScore dive = new DiveScore();

        // Get the input from each of the seven judges and validate the input
        // each time
        for (int i=1;i < 8;i++)
        {
            // Prompt for and get input
            System.out.print("Judge #" + i + ", enter score: ");
            input = keyboard.nextDouble();

            // Input validation
            if(input < 0.0 || input > 10.0)
            {
                System.out.println("Invalid. Now exiting.");
                return;
            }
            else
            {
                dive.scores.add(input);
                System.out.println("Score recorded.");
            }
        }

        // Get the degree of difficulty now
        System.out.print("Please enter degree of difficulty: ");
        input = keyboard.nextDouble();

        // Input validation
        if(input < 1.2 || input > 3.8)
        {
            System.out.println("Invalid. Now exiting.");
            return;
        }
        else
        {
            dive.difficulty = input;
            System.out.println("Difficulty recorded." + input);
        }

        // Call get dive score and print the score
        System.out.println("The diver's score is: ");
        System.out.println(dive.getDiveScore());
    }


}
