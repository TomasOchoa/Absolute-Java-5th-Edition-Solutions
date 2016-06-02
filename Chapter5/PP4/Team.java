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
public class Team
{
//Instance Variables
    private String teamName;
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private Competition competition1;
    private Competition competition2;

//--------------------Constructors--------------------
    // 5 variable
    public Team(String n,String m1,String m2,String m3,String m4)
    {
        teamName = n;
        name1 = m1;
        name2 = m2;
        name3 = m3;
        name4 = m4;
        competition1 = null;
        competition2 = null;
    }
    // Deep Copy Constructor
    public Team(Team other)
    {
        teamName = other.teamName;
        name1 = other.name1;
        name2 = other.name2;
        name3 = other.name3;
        name4 = other.name4;
        competition1 = other.competition1;
        competition2 = other.competition2;
    }
//---------------------Accessors----------------------
    /**
     * Accessor method to return the name of the team
     * @return Name of team
     * */
    public String getTeamName()
    {
        return teamName;
    }
    /**
     * Accessor method to return the name of member1
     * @return Name of member1
     * */
    public String getName1()
    {
        return name1;
    }
    /**
     * Accessor method to return the name of member2
     * @return Name of member2
     * */
    public String getName2()
    {
        return name2;
    }
    /**
     * Accessor method to return the name of member3
     * @return Name of member3
     * */
    public String getName3()
    {
        return name3;
    }
    /**
     * Accessor method to return the name of member1
     * @return Name of member1
     * */
    public String getName4()
    {
        return name4;
    }

//----------------------Mutators----------------------
    /**
     * Method to print out the information
     * */
    public void printInfo()
    {
        System.out.println("Team name: " + teamName);
        System.out.println("Team members: "  + name1 + ", " + name2 + ", " + name3 + ", " + name4);
        System.out.println("Competitions participated: " );
        // Check if not null for 1
        if(competition1 != null)
        {
            System.out.println(competition1.getName() + "," + competition1.getYear());
            System.out.println("Winning team: " + competition1.getWinner());
            System.out.println("Runner-up: " + competition1.getRunnerUp());
        }
        System.out.println();
        //Check if not null for 2
        if(competition2 != null)
        {
            System.out.println(competition2.getName() + "," + competition2.getYear());
            System.out.println("Winning team: " + competition2.getWinner());
            System.out.println("Runner-up: " + competition2.getRunnerUp());
        }
        System.out.println();
    }
    /**
     * Method to set competition1
     * */
    public void setCompetition1(Competition newComp)
    {
        competition1 = newComp;
    }
    /**
     * Method to set competition2
     * */
    public void setCompetition2(Competition newComp)
    {
        competition2 = newComp;
    }
    /**
     * Method to set team name
     * */
    public void setTeam(String m1,String m2,String m3,String m4)
    {
        name1 = m1;
        name2 = m2;
        name3 = m3;
        name4 = m4;
    }
}
