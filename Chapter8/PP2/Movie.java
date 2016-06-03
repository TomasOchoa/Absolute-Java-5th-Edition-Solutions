package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/23/2016.
 */
public abstract class Movie
{
// Instance Variables
    private String rating;
    private String title;
    private int id;
//-----------------------------------------------------Constructors-----------------------------------------------------
    /**
     * Default constructor
     * */
    public Movie()
    {
        title = "";
        id = 0;
        rating = "";
    }
    /**
     * Three argument constructor
     * @param theTitle The name of the new movie object
     * @param theId The id of the new movie object
     * @param theRating The rating of the new movie object
     * */
    public Movie(String theTitle,int theId,String theRating)
    {
        title = theTitle;
        id = theId;
        rating = theRating;
    }
//-------------------------------------------------------Accessors------------------------------------------------------
    /**
     * Accessor method to get the title of the movie
     * @return The title of the movie
     * */
    public String getTitle()
    {
        return title;
    }
    /**
     * Accessor method to get id of the movie
     * @return The id of the movie
     * */
    public int getId()
    {
        return id;
    }
    /**
     * Accessor method to get the rating of the movie
     * @return The rating of the movie
     * */
    public String getRating()
    {
        return rating;
    }
//--------------------------------------------------------Mutators------------------------------------------------------
    /**
     * Mutator method to set the title of the movie
     * @param newTitle The title to change the current title value
     * */
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }
    /**
     * Mutator method to set id of the movie
     * @param newId The id to change the current movie id
     * */
    public void setId(int newId)
    {
        this.id = newId;
    }
    /**
     * Mutator method to set the rating of the movie
     * @param newRating The rating to change the current movie's rating
     * */
    public void setRating(String newRating)
    {
        this.rating = newRating;
    }
//---------------------------------------------------------Helpers------------------------------------------------------
    /**
     * Helper function to calculate late fees
     * */
    public double calcLateFees(int days)
    {
        return (days * 2);
    }

    /**
     * Overloaded equals function to check if two movies are identical (checks id)
     *
     * */
    public boolean equals(Movie otherMovie)
    {
        //Just check if same id anything else is false
        if(otherMovie.id == this.id)
            return true;
        else
            return false;
    }

}
