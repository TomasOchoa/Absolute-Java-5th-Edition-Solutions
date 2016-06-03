package tomas.ochoa;
/**
 * Created by Tom's Desktop on 4/11/2016.
 */
public class Rectangle extends Figure
{
    public void erase()
    {
        System.out.println("Rectangle's class erase method.");
    }

    public void draw()
    {
        System.out.println("Rectangle's class' draw method.");
    }

    public void center()
    {
        System.out.println("Rectangle's class' center method.");
        erase();
        draw();
    }
}
