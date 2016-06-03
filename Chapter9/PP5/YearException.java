package tomas.ochoa;
/**
 Exception for year
 */
public class YearException extends Exception
{
    // Default Exception
    public YearException()
    {
        super("Invalid Year!");
    }

    public YearException(String message)
    {
        super(message);
    }


}
