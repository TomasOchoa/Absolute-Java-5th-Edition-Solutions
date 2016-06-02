package tomas.ochoa;
import java.security.PrivateKey;

/**
 * Created by Tom's Desktop on 3/9/2016.
 *
 * Define a class called Odometer that will be used to track fuel and mileage for an
 * automobile. The class should have instance variables to track the miles driven and
 * the fuel efficiency of the vehicle in miles per gallon. Include a mutator method
 * to reset the odometer to zero miles, a mutator method to set the fuel efficiency, a
 * mutator method that accepts miles driven for a trip and adds it to the odometer’s
 * total, and an accessor method that returns the number of gallons of gasoline that
 * the vehicle has consumed since the odometer was last reset.
 *
 * Use your class with a test program that creates several trips with different fuel
 * efficiencies. You should decide which variables should be public, if any.
 *
 * Instance Variables
 *  - miles driven
 *  - fuel efficiency (miles per gallon)
 *
 * Mutator Methods
 *  - Reset odomoter to 0
 *  - Set the fuel efficiency
 *  - Add miles driven for a trip
 *
 * Accessor Method
 * - Return number of gallons of gasoline consumed since last reset
 *
 */
public class Odometer
{
// Instance Variables
    private int milesDriven;
    private double fuelEfficiency;

// ---------- Constructors ----------
    // Default Constructor
    public Odometer()
    {
        milesDriven = 0;
        fuelEfficiency = 1.0;
    }

// Mutator Methods
    // Method to reset odometer to 0
    public void reset()
    {
        milesDriven = 0;
    }

    //Method to set the fuel efficiency
    public void setFuelEfficiency(double f)
    {
        fuelEfficiency = f;
    }

    //Method to add miles driven to a trip
    public void milesDriven(int m)
    {
        milesDriven = milesDriven + m;
    }

    // method to calculate gallons consumed
    public double gallonsUsed()
    {
        double galUsed = milesDriven/fuelEfficiency;
        return galUsed;
    }




}
