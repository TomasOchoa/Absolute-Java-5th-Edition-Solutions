package tomas.ochoa;

public class Main
{
    public static void main(String[] args)
    {
	// Test methods
        Counter c = new Counter();
        Counter c2 = new Counter();

        c.incrementCounter();
        c.incrementCounter();
        c.incrementCounter();
        c.incrementCounter();// should be 4
        c2.incrementCounter();
        c2.incrementCounter();
        c2.incrementCounter();
        c2.incrementCounter();// should be 4
        c.showCount();
        c2.showCount();
        if(c.equals(c2))
            System.out.println("True");
        else
            System.out.println("False");
        c.decrementCounter();
        c.decrementCounter();
        c.decrementCounter();
        c.showCount();
        c2.showCount();
        if(c.equals(c2))
            System.out.println("True");
        else
            System.out.println("False");




    }
}
