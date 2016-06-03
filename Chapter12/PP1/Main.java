package tomas.ochoa;

public class Main {

    public static void main(String[] args)
    {
	// Test  the movie class with several objects
        // Create several Movie Objects
        Movie movie_1 = new Movie("The Dark Knight",2008,165,11.25);
        Movie movie_2 = new Movie("The Avengers",2012,143,10.50);
        Movie movie_3 = new Movie("Spider-Man 3",2007,139,9.56);
        Movie movie_4 = new Movie("Superman",143,1978,7.45);
        Movie movie_5 = new Movie("Captain America",2011,124,11.75);

    // Use each objects printDescription member method to show variables
        movie_1.printDescription();
        System.out.println("------------------------");
        movie_2.printDescription();
        System.out.println("------------------------");
        movie_3.printDescription();
        System.out.println("------------------------");
        movie_4.printDescription();
        System.out.println("------------------------");
        movie_5.printDescription();
        System.out.println("------------------------");
    }
}
