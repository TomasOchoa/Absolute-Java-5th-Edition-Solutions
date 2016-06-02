package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/22/2016.
 *
 * Class name:
 - payment

 Instance Variables:
 - double paymentAmount

 Accessor Method:
 - double getPaymentAmount()

 Mutator Method:
 - void setPaymentAmount(double aPayment)

 Etc Method:
 - String paymentDetails()
 - Describes the amount of the payment

 */
public abstract class Payment
{
// Instance Variables
    protected double paymentAmount;

//--------------------Constructor--------------------
    /**
     * One Variable Constructor
     * */
    public Payment(double amount)
    {
        this.paymentAmount = Math.round(amount*100)/100.0;
    }
//--------------------Accessor--------------------
    /**
     * Accessor method to return the payment amount
     * @return the amount of the payment
     * */
    public double getPaymentAmount()
    {
        return paymentAmount;
    }
//--------------------Mutator--------------------
    /**
     * Mutator method to set the amount for the payment
     * @param payment
     *           The amount to set the variable to
     * */
    public void setPaymentAmount(double payment)
    {
        this.paymentAmount = payment;
    }
    /**
     * Method to print the amount of the payment
     * */
    public void paymentDetails()
    {
        System.out.println("Payment of $" + this.paymentAmount);
    }

}
