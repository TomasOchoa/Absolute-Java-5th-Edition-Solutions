package tomas.ochoa;
/**
 */

public class Main
{// start Main class
    public static void main(String[] args)
    {
        FileNumbers standardDeviation = new FileNumbers("file.txt");
        System.out.println("Standard Deviation: " + standardDeviation.getStdDev());

    }//end main method
}// end Main class
