package tomas.ochoa;
import java.util.Random;

import static java.lang.Math.*;

/**
 *
 * Land:
 *  Puzzlevanie
 * People in Land:
 *  - Aaron
 *      - Poor shooter
 *          - Hits target with prob of 1/3
 *  - Bob
 *      - Better shooter
 *          - Hits target with prob of 1/2
 *  - Charlie
 *      - Expert shooter
 *          - Hits target 100% of time
 *
 * Premise:
 *  - People have an argument over which of three are the greatest puzzlers of all time
 *  - To end argument, all agree on dueling to the death
 *
 *
 *  Facts:
 *      - A hit means a kill
 *          - Person hit drops out of duel
 *      - To compensite for each other's accuracies
 *          - Three will fire in turns
 *              - Aaron first shooter
 *              - Bob is second shooter
 *              - Charlie is last
 *          - Cycle repeats until there was one man left standing
 *              - Last man standing is the greatest puzzler of all
 *
 *  Strategy for dueling:
 *      - Each man should shoot at the most acurate shooter still alive
 *          - This is based at the mere fact that shooter is deadlist and has best
 *            chance of hitting back in case miss (This is charlie-> 100% accuracy)
 *
 *  WRITE A PROGRAM TO SIMULATE THE DUEL USING STRATEGY ABOVE:
 *      - Program should use random numbers
 *      - The probabilities given in the problem is used to determine whether a shooter hits the target or not
 *      - Create a class named duelist
 *          - Contains the duelers name
 *          - Contains the duelers shooting accuracy
 *          - A boolean indicating wheter alive or dead
 *          - A method ShootAtTarget(duelist target) that sets the target to dead if the dueler
 *            hits his target (using a random number and the shooting accuracy) and does nothing
 *            otherwise)
 *
 *      - When ONE game is able to be simulated:
 *          - Add a loop to simmulate 10,000 times
 *          - Count the number of times each contestant wins
 *          - Print the probability of winning for each contestant
 *              - E.G. For aaron your program output might be;
 *              "Aaron won 3,595/10,000 duels! "
 *
 * ALTERNATE STRATEGY:
 *      - An alternate strategy is for Aaron to miss on his first shot
 *      - Modify program to accomidate this new strategy
 *      - Ouput the probability of winning for each contestant
 *
 * QUESTIONS:
 *      - Which strategy is better for Aaron?
 *          - Intentionally miss on the first shot?
 *          - Try and hit the best shooter?
 *          - Who has the best chance of winning?
 *              - The best shooter?
 *              - The worst shooter?
 *
 * ------------------------------------------------ Algorithm ------------------------------------------------
 *
 * Main:
 *      - Declare 3 variables of type duelist
 *
 * Class:
 *      Name:
 *          - Duelist
 *
 *      Variables:
 *          - DuelerName
 *              - String
 *              - Dueler's Name
 *              - Private
 *          - Dueler's Accuracy (Private)
 *              - Double
 *              - Ratio
 *              - Given probability
 *          - Boolean
 *              - Alive?
 *                  - Yes = True
 *              - Dead
 *                  - Alive = No = False
 *
 *      Mehtods:
 *          - ShootAtTarget
 *              - Paramater: A duelist
 *              - returns: Nothing
 *              - Algorithm
 *
 *                - Set the dueler's accuracy to what was given
 *                - Set the random number generator to accuracy
 *                - A hit sets the duelist passed alive trait to false
 *                - If no hit alive = true
 *                - Return
 *
 */
public class Duelist
{
//-------------------- Instance Variables --------------------
    private String duelersName;
    private int accuracy;
    private boolean alive;

//----------------------- Constructors -----------------------
// Default Constructor
    public Duelist()
    {
        this.duelersName = null;
        this.accuracy = 0;
        this.alive = false;
    }
// 1 argument (Name only)
    public Duelist(String name)
    {
        this.duelersName = name;
        this.accuracy = 0;
        this.alive = true;
    }
// 2 arguments (Name and accuracy)
    public Duelist(String name, int acc)
    {
        this.duelersName = name;
        this.accuracy = acc;
        this.alive = true;
    }
// 3 arguments (Name, accuracy, and status)
    public Duelist(String name, int acc, boolean status)
    {
        this.duelersName = name;
        this.accuracy = acc;
        this.alive = status;
    }
//------------ Accessor Methods ------------
    /**
     * Accessor method to return the name of the duelist
     * @return The name of the dueler
     *
     * */
    public String getDuelersName()
    {
        String retName;
        retName = this.duelersName;
        return retName;
    }
    /**
     * Accessor method to return the status of the duelist
     * @return The status
     *
     * */
    public boolean getStatus()
    {
        boolean status;
        status = this.alive;
        return status;
    }
    /**
     * Method that returns a dead duelist
     * @return true: Alive
     * */
    public void isAlive()
    {
        this.alive = true;
    }
    /**
     * Method that returns a dead duelist
     * @return false: Not alive
     * */
    public void isNotAlive()
    {
        this.alive = false;
    }
//------------ Helper Methods ------------
    /**
     *  Helper method to shoot at a target once using the shooters accuracy.
     *  @param target
     *              The person the shooter is aiming at
     * */
    public void shootAtTarget(Duelist target)
    {
    // Rand gen
        Random randGen = new Random();
        int hit;

    // Check which prob
        switch (this.accuracy)
        {
            case 1:
            // Shoot with 100% accuracy
                target.isNotAlive();
                break;
            // Shoot with 50% accuracy
            case 2:
                hit = randGen.nextInt(2); // Picks are either 0,1
                if(hit == 1)
                    target.isNotAlive();
                else
                    target.isAlive();
                break;
            // Shoot with 33% accuracy
            case 3:
                hit = randGen.nextInt(3); // Picks are either 0,1,2
                if(hit == 2)
                    target.isNotAlive();
                else
                    target.isAlive();
                break;
        }
    }
}
