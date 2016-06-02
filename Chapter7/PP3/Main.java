package tomas.ochoa;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        //Call each types of Alien
        // NOTE: They can be casted because all are children of ALien
        Alien snake1 = new SnakeAlien("Steve the snake",30);
        Alien ogre1 = new OgreAlien("Thunderhawk the ogre",50);
        Alien marsh1 = new MarshmallowManAlien("The marshmallow man",100);

        // Create a pack of aliens and store these in an array of 3
        AlienPack packOaliens = new AlienPack(3);
        // Call method addAllien to add the alien to the index (second param)
        packOaliens.addAlien(snake1,0);
        packOaliens.addAlien(ogre1,1);
        packOaliens.addAlien(marsh1,2);

        //Test the accessors by printing all
        System.out.println("Alien 1: " + snake1.getName() + "\n" +
                           "Health : " + snake1.getHealth() + "\n" +
                           "Damage : " + snake1.getDamage());
        System.out.println("Alien 2: " + ogre1.getName() + "\n" +
                           "Health : " + ogre1.getHealth() + "\n" +
                           "Damage : " + ogre1.getDamage());
        System.out.println("Alien 3: " + marsh1.getName()+ "\n" +
                           "Health : " + marsh1.getHealth() + "\n" +
                           "Damage : " + marsh1.getDamage());

        // Test the alienpack damaage
        System.out.println("Total alien damage: " + packOaliens.calculateDamage());

    }
}
