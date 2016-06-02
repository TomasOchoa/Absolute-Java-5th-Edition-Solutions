package tomas.ochoa;

import java.util.Scanner;

/**
 * Write a program that inputs the name, quantity, and price of three items. The
 * name may contain spaces. Output a bill with a tax rate of 6.25%. All prices should
 * be output to two decimal places. The bill should be formatted in columns with
 * 30 characters for the name, 10 characters for the quantity, 10 characters for the
 * price, and 10 characters for the total. Sample input and output is shown as follows:
 *
 * Input name of item 1:
 * lollipops
 *
 * Input quantity of item 1:
 * 10
 *
 * Input price of item 1:
 * 0.50
 *
 * Input name of item 2:
 * diet soda
 *
 * Input quantity of item 2:
 * 3
 *
 * Input price of item 2:
 * 1.25
 *
 * Input name of item 3:
 * chocolate bar
 *
 * Input quantity of item 3:
 * 20
 *
 * Input price of item 3:
 * 0.75
 *
 * Your bill:
 *
 * Item                 Quantity        Price       Total
 * lollipops            10              0.50        5.00
 * diet soda            3               1.25        3.75
 * chocolate bar        20              0.75        15.00
 *
 * Subtotal                                         23.75
 * 6.25% sales tax                                   1.48
 * Total                                            25.23
 * */

public class Main
{
    public static final double TAX_RATE = .0625;

    public static void main(String[] args)
    {
	// Variables
        String item1;
        String item2;
        String item3;

        int quantityItem1;
        int quantityItem2;
        int quantityItem3;

        double item1Price;
        double item2Price;
        double item3Price;

        double subTotal;
        double total;
        double salesTax;

        double item1Total;
        double item2Total;
        double item3Total;

        Scanner keyboard = new Scanner(System.in);

    // Prompt for input
        // Item 1
        System.out.println("Enter name of item 1: ");
            item1 = keyboard.nextLine();
        System.out.println("Enter quantity of item 1: ");
            quantityItem1 = keyboard.nextInt();
        System.out.println("Enter price of item 1: ");
            item1Price = keyboard.nextDouble();
            keyboard.nextLine();

        // Item 2
        System.out.println("Enter name of item 2: ");
            item2 = keyboard.nextLine();
        System.out.println("Enter quantity of item 2: ");
            quantityItem2 = keyboard.nextInt();
        System.out.println("Enter price of item 1: ");
            item2Price = keyboard.nextDouble();
            keyboard.nextLine();

        // Item 3
        System.out.println("Enter name of item 3: ");
            item3 = keyboard.nextLine();
        System.out.println("Enter quantity of item 3: ");
            quantityItem3 = keyboard.nextInt();
        System.out.println("Enter price of item 3: ");
            item3Price = keyboard.nextDouble();
        keyboard.nextLine();

    // Calculate totals for each item, sub total, and total
        item1Total = quantityItem1 * item1Price;
        item2Total = quantityItem2 * item2Price;
        item3Total = quantityItem3 * item3Price;
        subTotal = item1Total + item2Total + item3Total;
        salesTax = (TAX_RATE) * subTotal;
        total = subTotal + salesTax;

    // Now display with format (use printf)
        //Top of table
        System.out.println("Your bill: \n");
        System.out.printf("%-30s%-10s%-10s%-10s%n","ITEM","QUANTITY","PRICE","TOTAL");
        // Results
        System.out.printf("%-30s%-10d%-10.2f%-10.2f%n",item1,quantityItem1,item1Price,item1Total);
        System.out.printf("%-30s%-10d%-10.2f%-10.2f%n",item2,quantityItem2,item2Price,item2Total);
        System.out.printf("%-30s%-10d%-10.2f%-10.2f%n",item3,quantityItem3,item3Price,item3Total);
        System.out.println("");
        System.out.printf("%-30s%-10s%-10s%-10.2f%n","SUBTOTAL","","",subTotal);
        System.out.printf("%-30s%-10s%-10s%-10.2f%n","6.25% SALES TAX","","",salesTax);
        System.out.printf("%-30s%-10s%-10s%-10.2f%n","TOTAL","","",total);







    }
}
