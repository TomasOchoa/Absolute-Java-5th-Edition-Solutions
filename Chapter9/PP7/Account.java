package tomas.ochoa;

public class Account
{
    private double balance;
    public Account()
    {
        balance = 0;
    }
    public Account(double initialDeposit)
    {
        balance = initialDeposit;
    }
    public double getBalance()
    {
        return balance;
    }
    // returns new balance or -1 if error
    public double deposit(double amount) throws NegativeAmountException
    {
        if (amount > 0)
            balance += amount;
        else
            throw new NegativeAmountException(); // Negative number exception
        return balance;
    }
    // returns new balance or -1 if invalid amount
    public double withdraw(double amount) throws InvalidAmountException
    {
        if ((amount > balance) || (amount < 0))
            throw new InvalidAmountException();
        else
            balance -= amount;
        return balance;
    }
}
