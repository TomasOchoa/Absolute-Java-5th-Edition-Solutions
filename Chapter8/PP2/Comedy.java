package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/23/2016.
 */
public class Comedy extends Movie
{
// Instance Variables
    // None extra needed from base class
//-----------------------------------------------------Constructors-----------------------------------------------------
// 3 arguments
    public Comedy(String theName,int theID,String theRating)
    {
        super(theName,theID,theRating);
    }
//-------------------------------------------------------Accessors------------------------------------------------------
//--------------------------------------------------------Mutators------------------------------------------------------
//---------------------------------------------------------Helpers------------------------------------------------------
    /**
     * Helper method to calculate the late fees for the movie
     * */
    public double calcLateFees(int days)
    {
        return (days*2.5);
    }
}
