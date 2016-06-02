package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/23/2016.
 - Instance Variables:
     - String name
     - int health
     - int damage

 - Constructors:
     - default (0args)
     - 2 args (name, health)
     - 3 args (name, health, damage)

 - Mutator Methods:
     - void setName(String newName)
     - void setHealth(int newHealth)
     - void setDamage

 - Accessor Methods:
     - int getName
     - int getHealth
     - int getDamage:
        - Returns the amount of damage the allien inflicts

 - Overloaded Methods:
    (NONE: Base class)
 - Overridden Methods:
    (NONE: Base class)
 */
public abstract class Alien
{
// Instance Variables
    private String name;
    private int health;
    private int damage;

//--------------------Constructors--------------------
    /**
     * Default Constructor
     * */
    public Alien()
    {
        this.name = "";
        this.health = 0;
        this.damage = 0;
    }
    /**
     * 2 argument constructor
     * */
    public Alien(String aName,int theHealth)
    {
        this.name = aName;
        this.health = theHealth;
        this.damage = 0;
    }
    /**
     * 3 argument constructor
     * */
    public Alien(String aName,int theHealth,int theDamage)
    {
        this.name = aName;
        this.health = theHealth;
        this.damage = theDamage;
    }
//-----------------------Mutators---------------------
    /**
     * Mutator method to set the alien's name
     * @param newName The name string to store in variable
     * */
    public void setName(String newName)
    {
        name = newName;
    }
    /**
     * Mutator method to set the alien's health
     * @param newHealth The value to set health to
     * */
    public void setHealth(int newHealth)
    {
        health = newHealth;
    }
    /**
     * Mutator method to set the alien's damage
     * @param newDamage The value to set the damage to
     * */
    public void setDamage(int newDamage)
    {
        damage = newDamage;
    }
//-----------------------Accessor---------------------
    /**
     * Accessor method to get the name of the Alien
     * */
    public String getName()
    {
        return name;
    }
    /**
     * Accessor method to get the health value of the Alien
     * */
    public int getHealth()
    {
        return health;
    }
    /**
     * Accessor method to get the damage value of the Alien
     * */
    public int getDamage()
    {
        return damage;
    }
//-----------------Overloaded Methods-----------------
    //NONE. THIS IS THE BASE CLASS
//-----------------Overridden Methods-----------------
    //NONE. THIS IS THE BASE CLASS

}
