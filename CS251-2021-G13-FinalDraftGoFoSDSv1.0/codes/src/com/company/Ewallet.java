package com.company;
/**
 *
 * @author dina zakaria moustafa (20190197)
 */
public class Ewallet {
    int amount;

    public Ewallet()
    {
        amount=0;
    }

    /**
     *
     * @param amount it is the amount of money in the Ewallet of the player or the owner
     */
    public Ewallet(int amount)
    {
        this.amount=amount;

    }

    /**
     *
     * @param amount  it is the amount of money in the Ewallet of the player
     * @return true if the money is enough and false if not
     */
    public boolean checkMoney(int amount)
    {
        if(this.amount>=amount)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     *
     * @param amount  it is the amount of money in the Ewallet of the player
     * @return true if the money is enough and false if not
     */
    public boolean pay(int amount)
    {
        if(checkMoney(amount)) {
            this.amount = this.amount - amount;
            return true;
        }
        else
        {
            System.out.println("there is no enough money");
            return false;
        }
    }

    /**
     *
     * @param amount it is the money that the player or owner want to add in their Ewallet
     */
    public void addMoney(int amount)
    {
        this.amount=amount+this.amount;
        System.out.println("amount is added");
    }


}
