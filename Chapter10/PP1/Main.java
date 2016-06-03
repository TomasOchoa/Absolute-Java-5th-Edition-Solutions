package tomas.ochoa;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
    // Read files
        NameFinder finder = new NameFinder();
        finder.readFile("boynames.txt");
        finder.readFile("girlnames.txt");

    // Get data
        finder.getNameData();

    }// end main method
}// end main class
