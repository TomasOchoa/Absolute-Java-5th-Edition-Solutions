package tomas.ochoa;
/**
 * One way to estimate the adult height of a child is to use the following formula,
 * which uses the height of the parents:
 *
 * H_male_child = ((H_mother * 13/12) + H_father)/2
 * H_female_child =((H_father * 12/13) + H_mother)/2
 *
 * All heights are in inches. Write a program that takes as input the gender of the
 * child, the height of the mother in inches, and the height of the father in inches,
 * and outputs the estimated adult height of the child in inches. The program should
 * allow the user to enter a new set of values and output the predicted height until the
 * user decides to exit. The user should be able to input the heights in feet and inches,
 * and the program should output the estimated height of the child in feet and inches.
 * Use the int data type to store the heights.
 *
 * */

public class Height
{
// Variables
    // Globals that hold facts of gender
    public static final boolean MALE = true;
    public static final boolean FEMALE = true;
    // variables for attributes that effect height
    private boolean gender;
    private Integer height_feet;
    private Integer height_inches;
// ----------------------- Constructors -----------------------
    // Default
    public Height()
    {
        gender = false;
        height_feet = 0;
        height_inches = 0;
    }
    // 1 arg
    public Height(String g)
    {
    // Set gender
        if (g.equalsIgnoreCase("male"))
            gender = MALE;
        else if (g.equalsIgnoreCase("female"))
            gender = FEMALE;
        height_feet = 0;
        height_inches = 0;
    }
    // 2 arg
    public Height(String g,int hF)
    {
    // Set gender
        if (g.equalsIgnoreCase("male"))
            gender = MALE;
        else if (g.equalsIgnoreCase("female"))
            gender = FEMALE;
        height_feet = 0;
        height_inches = 0;
    // set height
        height_feet = hF;
        height_inches = 0;
    }
    // 3 arg
    public Height(String g,int hF,int hI)
    {
        // Set gender
        if (g.equalsIgnoreCase("male"))
            gender = MALE;
        else if (g.equalsIgnoreCase("female"))
            gender = FEMALE;
        height_feet = 0;
        height_inches = 0;
        // set height
        height_feet = hF;
        height_inches = hI;
    }
// ----------------------- Accessors -----------------------
    // Gets gender of person
    public boolean getGender()
    {
        boolean sex = this.gender;
        return sex;
    }
    // Get height (feet)
    public int getHeightFeet()
    {
        int hF = this.height_feet;
        return hF;
    }
    // Get height (inches)
    public int getHeightInches()
    {
        int hI = this.height_inches;
        return hI;
    }
// ----------------------- Mutators -----------------------
    // Set gender
    public void setGender(String g)
    {
        if (g.equalsIgnoreCase("male"))
            this.gender = MALE;
        else if (g.equalsIgnoreCase("female"))
            this.gender = FEMALE;
    }

    // Set height(feet)
    public void setHeight_feet(int hF)
    {
        this.height_feet = hF;
    }
    // Set height(inches)
    public void setHeight_inches(int hI)
    {
        this.height_feet = hI;
    }




}
