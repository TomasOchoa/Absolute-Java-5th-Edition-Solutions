package tomas.ochoa;
import java.security.PublicKey;
import java.util.Scanner;

/**
 * One way to estimate the adult height of a child is to use the following formula,
 * which uses the height of the parents:
 *
 * H_male_child = ((H_mother * 13/12) + H_father)/2
 * H_female_child =((H_father * 12/13) + H_mother)/2
 *
 * All heights are in inches. Write a program that takes as input the gender of the
 * child, the height of the mother in inches, and the height of the father in inches,
 * and outputs the estimated adult height of the child in inches. The program should
 * allow the user to enter a new set of values and output the predicted height until the
 * user decides to exit. The user should be able to input the heights in feet and inches,
 * and the program should output the estimated height of the child in feet and inches.
 * Use the int data type to store the heights.
 *
 * */


public class Main
{

    public static void main(String[] args)
    {
    // Variables
        Height father = new Height("male");
        Height mother = new Height("female");
        Height child = new Height();
        Scanner keyboard = new Scanner(System.in);

    // Prompt for iput
        System.out.print("Please enter gender of child: " );
        child.setGender(keyboard.nextLine());
        System.out.print("Please enter father's height hes): " );





    }
}
