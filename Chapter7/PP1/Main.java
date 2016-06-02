package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/22/2016.
 *
 * main:
 - create at least two CashPayment
 - Each has different values
 - Call payment details

 - create at least two CreditCardPayment
 - Each has different values
 - Call payment details



 */
public class Main
{
    public static void main(String[] args)
    {
    // Two Cash Payments
        CashPayment cash1 = new CashPayment(99.99);
        CashPayment cash2 = new CashPayment(57.99);

    // Two Credit Card Payments
        CreditCardPayment credit1 = new CreditCardPayment(5.21, "John Smith",
                                                                        "9/14", "************4583");
        CreditCardPayment credit2 = new CreditCardPayment(49.67, "Michael Oulenhertz",

                                                                        "4/17", "123456789023456");

    // Show details for each payment
        cash1.paymentDetails();
        credit1.paymentDetails();
        cash2.paymentDetails();
        credit2.paymentDetails();




    }
}
