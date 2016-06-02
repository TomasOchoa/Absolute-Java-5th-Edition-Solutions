package tomas.ochoa;
/**
 Facts:
 a team = 4 members
 every year has 2 competitions
 name of class is Team

 Instance Variables:
 String teamName
 For team members
 String name1, name2 name3 namef
 Inffo on each competition
 Competition competition1, competition2

 For Competition Class:
 - Name of competition
 - Name of the winning team
 - Name of the runner-up
 - year of the competition

 For Team class:
 - constructor methods
 - Accessor methods
 - mutator methods
 - Data entry is very similar to previous year
 - Create a deep copy constructor for Team class
 - test it by creating a copy of an exisiting object
 - change competition info
 - ouput data of original
 - should be unchanged


 */
public class Competition
{
//Instance variables
    private String name;
    private String winner;
    private String runnerUp;
    private int year;

//--------------------Constructors--------------------
    //Default
    // 2 variables
    public Competition(String n,int y)
    {
        this.name = n;
        this.year = y;
        runnerUp = "";
        winner = "";
    }
//---------------------Accessors----------------------
    /**
     * Accessor method to get the name of the competition
     * @return Competition name
     * */
    public String getName()
    {
        return name;
    }/**
    * Accessor method to get the name of the winning team
    * @return Competition winner
    * */
    public String getWinner()
    {
        return winner;
    }
    /**
     * Accessor method to get the name of the runner up team
     * @return Competition runner up
     * */
    public String getRunnerUp()
    {
        return runnerUp;
    }
    /**
     * Accessor method to get the name of the runner up team
     * @return Competition runner up
     * */
    public int getYear()
    {
        return year;
    }
//----------------------Mutators----------------------
    /**
     * Mutator method to set the name of the competition
     * */
    public void setName(String n)
    {
        name = n;
    }
    /**
     * Mutator method to set the name of the winner
     * */
    public void setWinner(String w)
    {
        winner = w;
    }
    /**
     * Mutator method to set the name of the runner up
     * */
    public void setRunnerUp(String r)
    {
        runnerUp = r;
    }
    /**
     * Mutator method to set the year of the comp
     * */
    public void setYear(int y)
    {
        year = y;
    }


}
