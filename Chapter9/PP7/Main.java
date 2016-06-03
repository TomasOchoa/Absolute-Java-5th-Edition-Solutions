package tomas.ochoa;

import java.text.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //flag
        boolean exit = false;
        //scanner
        Scanner keyboard = new Scanner(System.in);
        // number formatter
        NumberFormat formatter = new DecimalFormat("#.00");

        // Create a new Account with an initial amount of $25,000
        Account chaseAccount = new Account(25000.00);

        // Menu
        while(!exit)
        {
            try
            {
                int choice = 0;
                // Menu
                System.out.println("Main Menu:\n" +
                                   "\n" +
                                   "1) Check balance \n" +
                                   "2) Withdraw \n" +
                                   "3) Deposit \n" +
                                   "4) Exit \n" +
                                   "\n");
                System.out.print(  "Choice: ");
                choice = keyboard.nextInt();

                // Switch to go to apropriate choice
                switch(choice)
                {
                    case 1:
                        System.out.println("Balance: " + formatter.format(chaseAccount.getBalance()));
                        System.out.println();
                        break;
                    case 2:
                    {
                        System.out.print("Enter amount: ");
                        chaseAccount.withdraw(keyboard.nextDouble());
                        break;
                    }
                    case 3:
                    {
                        System.out.print("Enter amount: ");
                        chaseAccount.deposit(keyboard.nextDouble());
                        break;
                    }
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
            catch(InvalidAmountException e)
            {
                System.out.println(e.getMessage());
            }
            catch(NegativeAmountException e)
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Goodbye!");




    }
}
