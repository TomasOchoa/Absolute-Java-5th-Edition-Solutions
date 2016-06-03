package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/25/2016.
 */
public class DivisionByZeroException extends Exception
{
    public DivisionByZeroException( )
    {
        super("Division by Zero!");
    }

    public DivisionByZeroException(String message)
    {
        super(message);
    }
}

