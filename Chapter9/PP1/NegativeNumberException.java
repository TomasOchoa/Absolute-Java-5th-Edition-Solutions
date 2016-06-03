package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/24/2016.
 */
public class NegativeNumberException extends Exception
{
// Default Constructor
    public NegativeNumberException()
    {
        super("N must be positive.");
    }
// 1 arg Constructor (string)
    public NegativeNumberException(String message)
    {
        super(message);
    }
}
