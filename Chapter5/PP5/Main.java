package tomas.ochoa;

public class Main
{
    public static void main(String[] args)
    {
	// create a no arg constructor
        Money noArg = new Money();
    // display the money object
        System.out.println(noArg.toString());

    // create a one arg constructor
        Money oneArg = new Money(10);
    // display the money object
        System.out.println(oneArg.toString());

    // create a two arg constructor
        Money twoArg = new Money(10,50);
    // display the money object
        System.out.println(twoArg.toString());

    // create two money objects to test for equality
        Money test1 = new Money(2,50);
        System.out.println(test1.toString());
        Money test2 = new Money(2,50);
        System.out.println(test2.toString());

    // Test for equality
        System.out.println(test1.equals(test2));

    //Addition
        Money sum = Money.add(test1,test2);
        System.out.println(sum.toString());

    //Subtraction
        Money diff = Money.minus(test1,test2);
        System.out.println(diff.toString());

    }
}
