package tomas.ochoa;
/**
 Exception for month
 */
public class MonthException extends Exception
{
    // Default Exception
    public MonthException()
    {
        super("Invalid Month!");
    }

    public MonthException(String message)
    {
        super(message);
    }


}
