package tomas.ochoa;
/***/

public class Main
{
    public static void main(String[] args)
    {
	// Create 3 different teams
        Team team1 = new Team("Blue","Bob","Benny","Bill","Barry");
        Team team2 = new Team("Red","Ron","Randy","Robert","Robin");
        Team team3 = new Team("Green","Gary","Gabriel","Gino","Graves");

    // Create the competitions
        Competition comp1 = new Competition("All-Star School League",2008);
        Competition comp2 = new Competition("Student Programming Competition",2010);

    // Set the proper info for each
        comp1.setWinner(team1.getTeamName());
        comp1.setRunnerUp(team3.getTeamName());

        comp2.setWinner(team1.getTeamName());
        comp2.setRunnerUp(team2.getTeamName());

    // Set the teams to have participated
        team1.setCompetition1(comp1);
        team1.setCompetition2(comp2);

        team2.setCompetition1(comp1);
        team2.setCompetition2(comp2);

        team3.setCompetition1(comp1);
        team3.setCompetition2(comp2);

    // Print info of each
        team1.printInfo();
        System.out.println("---");

        team2.printInfo();
        System.out.println("---");

        team3.printInfo();
        System.out.println("---");

    // Test copy constructor
        System.out.println("Testing copy constructor");
        Team test = new Team(team1);
        test.setTeam("John","Jake","Jill","Jack");
        test.printInfo();
        team1.printInfo();

    }
}
