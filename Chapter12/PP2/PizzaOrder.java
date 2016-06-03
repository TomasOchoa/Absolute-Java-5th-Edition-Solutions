package tomas.ochoa;
/**
 * The PizzaOrder class contains an array of Pizza’s. There is a method to add a
 new pizza to the array (which increments numPizzas) and also a method to calculate the
 cost of the entire order. A small pizza costs $8, a medium pizza is $10, and
 a large pizza costs $12. Each topping adds $1 to the pizza.
 */
public class PizzaOrder
{
    // Max amount of pizzas allowed in an order
    private final int MAXPIZZAS = 20;

    // INstance Variables
    private Pizza[] order = new Pizza[MAXPIZZAS];
    private int numPizzas = 0;

    // Methods
    public void addPizzaToOrder(char size,boolean pepperoni,boolean sausage,boolean mushrooms)
    {
        // If not max order
        if(numPizzas != MAXPIZZAS)
        {
            // then add to order and increment amount of pizzas
            order[numPizzas] = new Pizza(size,pepperoni,sausage,mushrooms);
            numPizzas++;
        }
    }

    public double calcCost()
    {
        double cost = 0.00;

        // Go through each pizza in order and calc their sizes
        for(int i=0;i<numPizzas;i++)
        {
            //Small = $8
            if(order[i].getSize() == 's')
                cost+= 8.00;
            //Mediun = $10
            else if(order[i].getSize() == 'm')
                cost+= 10.00;
            //Large = $12
            else
                cost+= 12.00;
        }

        // Go through each pizza and calc toppings
        for(int i=0;i<numPizzas;i++)
            cost += order[i].getNumToppings() * 1.00;

        return cost;
    }
}
