package tomas.ochoa;

public class Main
{
    public static void main(String[] args)
    {
	// First test by creating objects
        Figure rectangle = new Rectangle();
        Figure triangle = new Triangle();

    // Call methods seperately to test
        // Rectangle
        rectangle.erase();
        rectangle.draw();
        rectangle.center();

        System.out.println();

        triangle.erase();
        triangle.draw();
        triangle.center();
    }
}
