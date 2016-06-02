package tomas.ochoa;

/**
 * Created by Tom's Desktop on 3/10/2016.
 *
 *      You operate several hot dog stands distributed throughout town. Define a class
 * named HotDogStand that has;
 *      1. An instance variable for the hot dog stand’s ID number
 *      2. An instance variable for how many hot dogs the stand has sold that day
 *
 *      - Create a constructor that allows a user of the class to initialize both values
 *
 *      - Create a method named justSold that increments by one the number of hot
 *        dogs the stand has sold
 *        - The idea is that this method will be invoked each time the stand sells a hot dog
 *          so that you can track the total number of hot dogs sold by the stand.
 *
 *      - A method that returns the number of hot dogs sold
 *      - A static variable that tracks the total number of hot dogs sold by all hot dog stands
 *      - A static method that returns the value in this variable
 *
 *      - Write a main method to test your class with at least three hot dog stands that each
 *      sell a variety of hot dogs.
 *
 */
public class HotDogStand
{
//static variable to keep track of the total number of dogs sold
    private static int TOTAL_HOT_DOGS_SOLD = 0;

    private int id;                 //id num of stand
    private int hotDogsSoldToday;   //variable to hold dogs sold that day



    /**
     *  Two argument Constructor.
     * @param i
     *      The ID number of the stand
     * @param sold
     *      The amount of hot dogs sold
     * */
    public HotDogStand(int i, int sold)
    {
        id = i;
        hotDogsSoldToday = sold;
        TOTAL_HOT_DOGS_SOLD += hotDogsSoldToday;
    }
    /**
     * Method that increments both the amount of hot dogs sold that day
     * and the total sold by the stand.
     * */
    public void justSold()
    {
        hotDogsSoldToday++;
        TOTAL_HOT_DOGS_SOLD++;
    }
    /**
     * Accessor method that returns the number of hot dogs sold that day by the stand
     * @return Returns the value of dogs sold that day
     * */
    public int getHotDogsSoldToday()
    {
        return this.hotDogsSoldToday;
    }
    /**
     * Static accessor method that returns the total amount of hot dogs sold
     * @return Returns the total amount sold by all stands
     * */
    public static int getTotalHotDogsSold()
    {
        return TOTAL_HOT_DOGS_SOLD;
    }

    public static void main(String args[])
    {
        // Class variables
        HotDogStand stand1 = new HotDogStand(1,45);
        HotDogStand stand2 = new HotDogStand(2,85);
        HotDogStand stand3 = new HotDogStand(3,1234);

        // Loop to sell hot dogs for stand1
        for (int i = 0;i < 10;i ++)
        {
            // Each stand just sold 1 hot dog
            stand1.justSold();

        }
        // Loop to sell hot dogs for stand2
        for (int i = 0;i < 100;i ++)
        {
            // Each stand just sold 1 hot dog
            stand2.justSold();
        }
        // Loop to sell hot dogs for stand3
        for (int i = 0;i < 1000;i ++)
        {
            // Each stand just sold 1 hot dog
            stand3.justSold();
        }
        // Display results
        System.out.println("Stand 1 has now sold " + stand1.getHotDogsSoldToday() + " hot dogs!");
        System.out.println("Stand 2 has now sold " + stand2.getHotDogsSoldToday() + " hot dogs!");
        System.out.println("Stand 3 has now sold " + stand3.getHotDogsSoldToday() + " hot dogs!\n");
        System.out.println("The stands have accumulateively sold " + getTotalHotDogsSold() + " today!");
    }
}
