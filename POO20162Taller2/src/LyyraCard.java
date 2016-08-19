public class LyyraCard
{

    //-------------------------------------------------------------------------------------------- ATTRIBUTES

    private double balance;

    //-------------------------------------------------------------------------------------------- CONSTRUCTOR

    public LyyraCard (double initialBalance)
    {
        this.balance = initialBalance;
    }

    //--------------------------------------------------------------------------------------------- METHODS

    public String toString ()
    {
        return ("The card has " + this.balance + " euros.");
    }

    public void payEconomical ()
    {
        /*
           If the lunch can't be paid (that is, if, after discounting it's price from the
           balance e have a negative balance), it isn't discounted from the balance.
           Otherwise, it is.
         */
        this.balance = ( (this.balance - 2.5) < 0 ? this.balance : this.balance - 2.5 );
    }

    public void payGourmet ()
    {
        this.balance = ( (this.balance - 4.0) < 0 ? this.balance : this.balance - 4.0 );
    }

    public void loadMoney (double load)
    {
        double newBalance = this.balance + load;

        if (load >= 0)
        {
            /*
               If, after the load, the balance is smaller than 150, there's no problem. Otherwise,
               there could be a problem: If the balance is bigger than that, we must discount the
               amount by which it0s bigger to it, and then, we'll always have 150.
             */
            this.balance = ( newBalance < 150 ? newBalance : newBalance - ( newBalance - 150 ) );
        }
    }

}
