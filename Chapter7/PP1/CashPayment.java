package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/22/2016.
 *
 * Class:
 - Name = CashPayment
 - Extends from Cash

 Overloaded Methods:
 - String paymentDetails()
 - Describes the amount of the payment
 - Indicates the payment is in cash

 Constructors
 - one arg



 */
public class CashPayment extends Payment
{
//--------------------Constructor--------------------
    /***
     * 1 arg constructor
     */
    public CashPayment(double value)
    {
    // User super to set it
        super(value);
    }
//--------------------Accessor--------------------
    // None
//--------------------Mutator--------------------
    // None

//--------------------Overloaded--------------------
    public void paymentDetails()
    {
        System.out.println("Payment of $" + this.paymentAmount + " in cash.");
    }
}
