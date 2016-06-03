package tomas.ochoa;
/**
 * Created by Tom's Desktop on 4/11/2016.
 */
public class Triangle extends Figure
{
    public void erase()
    {
        System.out.println("Triangle class' erase method.");
    }

    public void draw()
    {
        System.out.println("Triangle class' draw method.");
    }

    public void center()
    {
        System.out.println("Triangle class' center method.");
        erase();
        draw();
    }
}
