package tomas.ochoa;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class NameFinder
{
// Instance variables
    // Arrays to hold the names
    private String[] BoyNames = new String[1000]; //Array to hold boy names
    private String[] GirlNames = new String[1000];//Array to hold girl names

    // Counts to hold the count of names
    private int[] BoyCount = new int[1000];
    private int[] GirlCount = new int[1000];

// Constructors
// Accessor Methods
// Mutator Methods
// Helper Methods
    /**
     * Helper method to read the file
     * @param fileName The name of the txt file to search
     * */
    public void readFile(String fileName)
    {
    // Temp variables to store names and count
        String[] names = new String[1000];
        int[] count = new int[1000];

        try
        {
            String line = null;         // String to hold a line
            int counter = 0;            // Start at 0

            // Set a reader to the file given by the user
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            // Read a line, if it is not null (eof) then do stuff
            while((line = br.readLine())!= null)
            {
                // Split splits the line to elements therefore allowing the data to be saved easily to another array
                // Result: name | int => [name] | [int] [0] | [1]
                String data[] = line.split(" ");
                // counter = 0 so its at the first element for both arrays
                names[counter] = data[0]; // data[0] => names
                count[counter] = Integer.parseInt(data[1]); // data[1] => int
                counter++;
            }
        // Save the data according to which file
            // for boys
            if(fileName == "boynames.txt")
            {
                this.BoyNames = names;
                this.BoyCount = count;
            }
            // for girls
            else
            {
                this.GirlNames = names;
                this.GirlCount = count;
            }
            br.close();
        }
        // If file not found
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        // If error
        catch (IOException e)
        {
            System.out.println("An error occured with the input file.");
            e.printStackTrace();
        }
    }
    /**
     * Helper method to show user data about a particular name
     * */
    public void getNameData()
    {
    // Scanner class for input
        Scanner keyboard = new Scanner(System.in);

    // Prompt user for the name to get data about
        System.out.print("Please enter a name: ");
        String name = keyboard.next();

    // Search the name both boynames.txt and
    // girlname.txt If it is a match, then print the
    // popularity ranking and number of namings

    // For boys
        if(Arrays.asList(this.BoyNames).contains(name))
        {
            // get the index of where the name is
            // Use Arrays class to search the array of names that was taken from the file
            // then use the method asList to make a list from the array of the file, and then get
            // the index as to where the name searched was found
            int index = Arrays.asList(this.BoyNames).indexOf(name);

        // Using the index that was found from the list, we can get the number of occurences by simply
        // getting the value at the same index of the count array which would correspond for that name
            int occurences = BoyCount[index];

        // Now print result
            System.out.println(name + " is ranked " + (index + 1) + " in popularity among boys and was used " +
                               "a total of " + occurences + " times.");
        }
        // If name not found prompt user
        else
            System.out.println(name + " is not ranked among the top 1000 names for boys");

    // For girls
        // If the list of girl names has the name being searched for
        if(Arrays.asList(this.GirlNames).contains(name))
        {
            // get the index of where that name was found
            int index = Arrays.asList(GirlNames).indexOf(name);

            // Get the equivalent number of occurences by using that same index
            int occurences = GirlCount[index];

            // Print the result
            System.out.println(name + " is ranked " + (index + 1) + " in popularity among girls and was used " +
                               "a total of " + occurences + " times.");
        }
        else
            System.out.println(name + " is not ranked among the top 1000 names for girls");

    }
}
