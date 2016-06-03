package tomas.ochoa;

public class NegativeAmountException extends Exception
{
    public NegativeAmountException( )
    {
        super("Negative Amount Exception!");
    }

    public NegativeAmountException(String message)
    {
        super(message);
    }
}
