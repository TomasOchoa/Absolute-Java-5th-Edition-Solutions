package tomas.ochoa;

public class InvalidAmountException extends Exception
{
    public InvalidAmountException()
    {
        super("Invalid Amount Exception!");
    }

    public InvalidAmountException(String message)
    {
        super(message);
    }
}
