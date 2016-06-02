package tomas.ochoa;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

/**
 * A comma-separated values (CSV) file is a simple text format used to store a list of
 * records. A comma is used as a delimiter to separate the fields for each record. This
 * format is commonly used to transfer data between a spreadsheet or database. In
 * this Programming Project, consider a store that sells five products abbreviated as
 * A, B, C, D, and E. Customers can rate each product from 1–5, where 1 is poor
 * and 5 is excellent. The ratings are stored in a CSV file where each row contains
 * the customer’s rating for each product. Here is a sample file with three customer
 * ratings:
 *
 * A,B,C,D,E
 * 3,0,5,1,2
 * 1,1,4,2,1
 * 0,0,5,1,3
 *
 * In this file format, the first line gives the products. The digit 0 indicates that a
 * customer did not rate a product. In this case, the first customer rated A as 3, C as
 * 5, D as 1, and E as 2. Product B was not rated. The third customer rated C as 5,
 * D as 1, and E as 3. The third customer did not rate A or B.
 *
 * Create a text file in this format with sample ratings. Then, write a program that
 * reads in this text file and extracts each rating using the StringTokenizer class.
 * Finally, the program should output the average rating for each product. Customers
 * that did not rate a product should not be considered when computing the average
 * rating for that product. Your program can assume there will always be exactly five
 * products but it should work with an arbitrary number of customer ratings.
 *
 * vars:
 *
 * facts:
 * - 0 rating = not rated a product
 * - 5 max rating
 * - cusomer rating are in rows
 * - product ratins are in cols
 *
 * program:
 * - reads in text file
 * - extracts each rating using stringTokenizer class
 * - output average rating for each product
 *  - customers not rated shouldt be included when calcing avg
 *  - Assume always 5 products
 *      - should work with arbitrary number of customer ratings
 *
 *
 * */
public class CustomerRatings
{
    public static void main(String[] args)
    {
    // Scanner Object to open and read a text file called "ratings.txt" using file inputstream
        Scanner fileReader = null;

    // Create a decimal format to set the average rating up to two decimals
        DecimalFormat decimalFormater = new DecimalFormat(".00");
    // Use try-catch block to catch an exception if file not found
        try
        {
            // open file to read
            fileReader = new Scanner(new FileInputStream("ratings.txt"));
        }
        catch (FileNotFoundException e)
        {
            // If not found exit program
            System.out.println("File not found");
            System.exit(0);
        }
    // Now read the first line of the file using nextLine method
        String products = fileReader.nextLine();

    // create variables to count total number of customers for a particular product
        double totalAratings = 0;
        double totalBratings = 0;
        double totalCratings = 0;
        double totalDratings = 0;
        double totalEratings = 0;

    // create 5 variables to count toal number of customers for a particular product
        double customerACount = 0;
        double customerBCount = 0;
        double customerCCount = 0;
        double customerDCount = 0;
        double customerECount = 0;

    // Variable to store the user rating
        int userRate;

    // Repeat the loop to scan through each line and get
    // the ratings until no more ratings are found in the file
        while (fileReader.hasNextLine())
        {
        //Get the line from the file reader
            String ratingsLine = fileReader.nextLine();

        // Split string using the tokenizer class with ratingslIne and "," comma
        // used to seperate the raings from the line
            StringTokenizer splitRatings = new StringTokenizer(ratingsLine,",");

        // Loop through each token elements until not found any ratings in the line
            while (splitRatings.hasMoreElements())
            {
            // Read ratings for product A
            // Read 5 ratings of five products using nextToken
                String productArating = splitRatings.nextToken();

            // Convert the string to int using parseInt method
            // NOTE: The moethod charAt(int index) which returns the character at index 0
                // Since the token is of integer in the form of string, it returns the ASCII value of the character
                // Therefore you must substract it by 48 to offset it and get it's actual value (think back to assembly)
                userRate = productArating.charAt(0)-48;

            // Check if rating is greater then 0 if it is then count it if not dont count it
                if (userRate > 0)
                {
                    totalAratings = totalAratings + userRate;
                    customerACount = customerACount + 1;
                }
            // Read the ratings for product B
                String productBrating = splitRatings.nextToken();
                userRate = productBrating.charAt(0)-48;

            // // Check if rating is greater then 0 if it is then count it if not dont count it
                if (userRate > 0)
                {
                    totalBratings = totalBratings + userRate;
                    customerBCount = customerBCount + 1;
                }

            // Read the ratings for product C
                String productCrating = splitRatings.nextToken();
                userRate = productCrating.charAt(0)-48;

            // // Check if rating is greater then 0 if it is then count it if not dont count it
                if (userRate > 0)
                {
                    totalCratings = totalCratings + userRate;
                    customerCCount = customerCCount + 1;
                }

            // Read the ratings for product D
                String productDrating = splitRatings.nextToken();
                userRate = productDrating.charAt(0)-48;

            // // Check if rating is greater then 0 if it is then count it if not dont count it
                if (userRate > 0)
                {
                    totalDratings = totalDratings + userRate;
                    customerDCount = customerDCount + 1;
                }

            // Read the ratings for product E
                String productErating = splitRatings.nextToken();
                userRate = productErating.charAt(0)-48;

            // // Check if rating is greater then 0 if it is then count it if not dont count it
                if (userRate > 0)
                {
                    totalEratings = totalEratings + userRate;
                    customerECount = customerECount + 1;
                }
            // End of inner while loope
            }
        // End of outer while loop
        }

    //Close file
        fileReader.close();

    // Print each individual rating for all products and set the decimal value up to two digits
        System.out.println("Average ratings for each customer");
        System.out.println("=================================");
        System.out.println("Average rating for product \"A\": " + decimalFormater.format(totalAratings/customerACount));
        System.out.println("Average rating for product \"B\": " + decimalFormater.format(totalBratings/customerBCount));
        System.out.println("Average rating for product \"C\": " + decimalFormater.format(totalCratings/customerCCount));
        System.out.println("Average rating for product \"D\": " + decimalFormater.format(totalDratings/customerDCount));
        System.out.println("Average rating for product \"E\": " + decimalFormater.format(totalEratings/customerECount));

    // End of main method
    }
// End of class
}
