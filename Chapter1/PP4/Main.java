package tomas.ochoa;

/**
 *  A government research lab has concluded that an artificial sweetener commonly
 * used in diet soda pop will cause death in laboratory mice. A friend of yours is
 * desperate to lose weight but cannot give up soda pop. Your friend wants to know
 * how much diet soda pop it is possible to drink without dying as a result. Write a
 * program to supply the answer. The program has no input but does have defined
 * constants for the following items: the amount of artificial sweetener needed to kill
 * a mouse, the weight of the mouse, the starting weight of the dieter, and the desired
 * weight of the dieter. To ensure the safety of your friend, be sure the program uses
 * the weight at which the dieter will stop dieting, rather than the dieter’s current
 * weight, to calculate how much soda pop the dieter can safely drink. You may use
 * any reasonable values for these defined constants. Assume that diet soda contains
 * 1/10th of 1% artificial sweetener. Use another named constant for this fraction.
 * You may want to express the percent as the double value 0.001. (If your program
 * turns out not to use a defined constant, you may remove that defined constant
 * from your program.)
 *
 * artSweetKillMouse;
 * mouseWeight;
 * startingWeightDieter;
 * desireWeightDieter; (weight where the dieter will STOP dieting)
 *
 *
 * */

public class Main {

    public static void main(String[] args)
    {
        final double CONCENTRATION = 0.001;

	// write your code here
        double mouseWeight = 0.020;
        double mouseDeath = 0.0000013;
        double ratioMouse = 0.0;

        double startingWeightDieter = 120.0;
        double desireWeightDieter = 90.0;

        double fatalSoda;

        // First find the proportin of the dead mouse
        ratioMouse = (mouseDeath/mouseWeight);
        // Person dies at desired weight/concentraiton * ratio

        fatalSoda = (desireWeightDieter/CONCENTRATION) * ratioMouse;

        //Disaply outpit
        System.out.println("Dieter can safely have up to " + fatalSoda + " liters od soda a day before dying.");


    }
}
