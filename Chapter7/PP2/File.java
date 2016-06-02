package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/22/2016.
 Class: File extends Document
    - Instance Variables:
        - string pathname
        - text contents stored in inherited text variable
    - Constructors:
        - 1 variable
            - use super to set preivous shit
            - String thePath
 - Accessors:
    - getPath?
 - Mutators:
    - setPath?
 - Overloaded:
    - toString
        - concatenates all text fields
 */
public class File extends Document
{
// Instance variables
    private String pathName;
//--------------------Constructors--------------------
    //Default
    public File()
    {
        super("");
        pathName = "";
    }
    //2 argument
    public File(String thePath,String someText)
    {
        super(someText);
        pathName = thePath;
    }
//----------------------Accessors---------------------
    //Accessor method to get the path name
    public String getPathName()
    {
        return pathName;
    }
//-----------------------Mutators---------------------
    // Mutator to set a new path name
    public void setPathName(String newPath)
    {
        pathName = newPath;
    }
//----------------------Overloaded--------------------
    // Overloaded toString to have all text concattenated
    public String toString()
    {
        return ("File path: " + pathName + "\n" +
                "File contents: \n" +
                super.toString());
    }


}
