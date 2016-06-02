package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/23/2016.
 */
public class AlienPack
{
    private Alien[] aliens;

    public AlienPack (int numAliens)
    {
        aliens = new Alien[numAliens];
    }

    public void addAlien(Alien newAlien, int index)
    {
        aliens[index] = newAlien;
    }

    public Alien[] getAliens()
    {
        return aliens;
    }

    public int calculateDamage()
    {
        int damage = 0;

        for (int i=0; i < aliens.length; i++)
        {
            /*
            if (aliens[i].type==Alien.SNAKE_ALIEN)
            {
                damage +=10;// Snake does 10 damage
            }
            else if (aliens[i].type==Alien.OGRE_ALIEN)
            {
                damage +=6;// Ogre does 6 damage
            }
            else if (aliens[i].type==Alien.MARSHMALLOW_MAN_ALIEN)
            {
                damage +=1;
                // Marshmallow Man does 1 damage
            }
            */
            // Adjust for object oriented implementations
            if (aliens[i] != null)
                damage += aliens[i].getDamage();
        }
        return damage;
    }
}