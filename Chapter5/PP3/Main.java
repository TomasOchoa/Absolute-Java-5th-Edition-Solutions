package tomas.ochoa;

public class Main {

    public static void main(String[] args)
    {
    //  for(int i = 0; i < 10000; i++)
    //  {
    //  }

    // Strategy 1
        // Is everyone still alive?
            // All three shoot at best shooter
                // Did someone kill the best shooter?
                    // Yes, aim at last target
                    // No, shoot again
        // Else shoot at last man standing
            // Did shot kill?
                // Yes left person is last one standing
                // No shoot again

   // Declare 3 duelers
        Duelist dueler1 = new Duelist("Aaron", (3));
        Duelist dueler2 = new Duelist("Bob", (2));
        Duelist dueler3 = new Duelist("Charlie", 1);
        Duelist winner = null;

        // Check if all is alive still
        if(dueler1.getStatus() && dueler2.getStatus() && dueler3.getStatus())
        {
            // Everyman shoots at target with highest accuracy
            dueler3.shootAtTarget(dueler2);             // Charlie shoots bob
            dueler2.shootAtTarget(dueler3);             // Bob shoots at charlie
            dueler1.shootAtTarget(dueler3);             // Aaron shoots at charlie
        }
        // If charlie is dead and rest is standing
        else if (!dueler3.getStatus() && dueler1.getStatus() && dueler2.getStatus())
        {
            // Everyman shoots at target with highest accuracy
            dueler2.shootAtTarget(dueler1);             // Bob shoots at charlie
            dueler1.shootAtTarget(dueler2);             // Aaron shoots at charlie
        }
        // If charlie is still alive and either one is still standing
        else if(dueler3.getStatus() & dueler1.getStatus() || dueler2.getStatus())
        {
            // For charlie
            if (dueler2.getStatus())
                dueler3.shootAtTarget(dueler2);
            else
                dueler3.shootAtTarget(dueler1);

            // For Bob
            if(dueler2.getStatus())
            {
                if (dueler3.getStatus())
                    dueler2.shootAtTarget(dueler3);
                else
                    dueler2.shootAtTarget(dueler1);
            }

            // For Aaron
            if(dueler1.getStatus())
            {
                if (dueler3.getStatus())
                    dueler1.shootAtTarget(dueler3);
                else
                    dueler1.shootAtTarget(dueler2);
            }
        }

        // Declare winner
        if(dueler1.getStatus() && !dueler2.getStatus() && !dueler3.getStatus())
            winner = dueler1;
        else if(dueler2.getStatus() && !dueler1.getStatus() && !dueler3.getStatus())
            winner = dueler2;
        else if(dueler3.getStatus() && !dueler1.getStatus() && !dueler2.getStatus())
            winner = dueler3;










    // Strategy 2











        /*

        System.out.println("Name  : " + dueler1.getDuelersName());
        System.out.println("Prob  : " + dueler1.getAccuracy());
        System.out.println("Status: " + dueler1.getStatus());

        System.out.println("Name  : " + dueler2.getDuelersName());
        System.out.println("Prob  : " + dueler2.getAccuracy());
        System.out.println("Status: " + dueler2.getStatus());

        System.out.println("Name  : " + dueler3.getDuelersName());
        System.out.println("Prob  : " + dueler3.getAccuracy());
        System.out.println("Status: " + dueler3.getStatus());

        */
    }
}
