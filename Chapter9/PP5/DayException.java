package tomas.ochoa;
/**
 Exception for day
 */
public class DayException extends Exception
{
    // Default Exception
    public DayException()
    {
        super("Invalid Day!");
    }

    public DayException(String message)
    {
        super(message);
    }


}
