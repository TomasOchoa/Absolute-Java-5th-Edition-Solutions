package tomas.ochoa;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        // declare a var of type Fraction
        Fraction fraction = new Fraction(40,10);

        System.out.println("Numerator:           " + fraction.getNum());
        System.out.println("Denominator:         " + fraction.getDen());
        System.out.println("Double result:       " + fraction.doubleResult());
        System.out.println("Reduced numerator:   " + fraction.reducedNum());
        System.out.println("Reduced denominator: " + fraction.reducedDen());

    }
}
