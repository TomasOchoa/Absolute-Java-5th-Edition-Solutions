package tomas.ochoa;

public class Main
{
    public static void main(String[] args)
    {
	// write your code here
        double initialAmount = 1000.00;
        double interestRate = .1;
        int years = 10;

        System.out.println("Initial amount: " + initialAmount);
        System.out.println("Interest rate/year: " + interestRate);
        System.out.println("Number of years: " + years);
        System.out.println("Total after "+years+" with "+interestRate+" interest: " + calculateInterest(initialAmount,interestRate,years));

    }

    // Method to calculate interest
    public static double calculateInterest(double amount, double rate,int years)
    {
        // Base case (0 = return just the amount)
        if(years == 0)
        {
            return amount;
        }
        // else if there are years, call calculate interest
        else
            return calculateInterest(amount*(1.00 + rate),rate,years - 1);

    }
}
