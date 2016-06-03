package tomas.ochoa;

public class Main
{
    public static void main(String[] args)
    {
    // Make an array of movies to test
        Movie movies[] = new Movie[6];
        movies[0] = new Action("True Lies",1001,"PG-13");
        movies[1] = new Comedy("21 Jump Street",1002,"PG-13");
        movies[2] = new Drama("Drive",1003,"R");
        movies[3] = new Action("Batman Begins",2001,"PG-13");
        movies[4] = new Comedy("Ted",2002,"R");
        movies[5] = new Drama("Drive",1003,"R");

    // PRint all
        for(int i=0;i<movies.length;i++)
        {
            System.out.println(movies[i].getTitle() + " has a rating of " + movies[i].getRating());
        }

    // Test to see if two movies same
        if(movies[2].equals(movies[5]))
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        if(movies[2].equals(movies[1]))
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        for(int i=0;i<movies.length;i++)
        {
            System.out.println("Late fees for "+ movies[i].getTitle() + ": $" + movies[i].calcLateFees(3));
        }
    }
}
