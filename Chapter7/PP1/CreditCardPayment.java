package tomas.ochoa;
/**
 * Created by Tom's Desktop on 3/22/2016.
 *
 *
 Class:
 - Name: CreditCardPayment
 - Extends Payment

 Added Instance Variables:
 - String nameOnCard
 -  experiationDate
 -  creditCardNumber

 Constructors:
 -


 Overloaded Methods:
 - String paymentDetails()
 - Include all credit card information in the printout
 */
public class CreditCardPayment extends Payment
{
// Added Instance Variables
    public String name;
    public String expiration;
    public String cardNumber;

// 4 variable constructor
    public CreditCardPayment(double value,String cardName, String cardExpiration, String number)
    {
    // Use the base constructor for 1 variable
        super(value);
    // ALl others use this constructor to instantiate
        this.name = cardName;
        this.expiration = cardExpiration;
        this.cardNumber = number;
    }
// Print out all info
    public void paymentDetails()
    {
        System.out.println("A payment of $" + this.paymentAmount + " by the card " +
                           this.cardNumber + ", expiration date "+
                           this.expiration + ", and owner " + this.name);
    }
}
