package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/22/2016.
 * Class: Document
    - Instance Variables:
        - String text:
            - Stores textual content for the document
    - Method:
        - toString
            - returns text field
    - Constructors
        - 1 variable
    - Accessors
        - not neccessary because toString already returns a string
    - Mutators
        - setText
 */
public abstract class Document
{
// Instance Variables
    private String text;
//--------------------Constructors--------------------
    /**
     * Default constructor
     * */
    public Document()
    {
        text = "";
    }
    /**
     * Constructor for text field
     * */
    public Document(String someText)
    {
        setText(someText);
    }
//----------------------Accessors---------------------
    // Unnecessary since toString allready returns a string
//-----------------------Mutators---------------------
    /**
     * Accessor method to change the text field
     * @param newText the text in which to change
     * */
    public void setText(String newText)
    {
        text = newText;
    }
    //---------------------Other Methods------------------
    /**
     * Overridden method to return the text field
     * @return the text field
     * */
    public String toString()
    {
        return text;
    }

}
