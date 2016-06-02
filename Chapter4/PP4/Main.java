package tomas.ochoa;

import java.util.Date;

public class Main {

    public static void main(String[] args)
    {
	// variables
        Date today = new Date(3,17,2016);
        BlogEntry entry1 = new BlogEntry("krazyman29", "yooooo fuck this mother fucking shit you " +
                                                       "cock sucking mother fucker", today);
        BlogEntry entry2 = new BlogEntry("krazyman29", "yooooo fuck this mother fucking shit you " +
                                                       "cock sucking", today);

        //entry1.DisplayEntry();
        entry2.getSummary();
        entry2.getSummary();


    }
}
