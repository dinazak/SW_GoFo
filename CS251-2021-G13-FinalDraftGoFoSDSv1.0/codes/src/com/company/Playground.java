package com.company;

/**
 *
 * @author mina samy (20190571)
 */

public class Playground
{

    private String hours, cancelPeriod, namePlayground, size;
    private float rate;
    private int index, price;

    /**
     *
     * @param hours the available hours
     * @param cancelPeriod the period in which the player can cancel the book in it
     * @param namePlayground the name of the playground
     * @param size the size of the playground
     * @param price the price of the playground per hour
     */
    public Playground(String hours, String cancelPeriod,String namePlayground,String size, int price)
    {
        this.hours = hours;
        this.cancelPeriod = cancelPeriod;
        this.namePlayground = namePlayground;
        this.size = size;
        this.price = price;

    }

    /**
     *
     * @param h to set the hours
     */
    void setHours(String h)
    {
        hours=h;
    }

    /**
     *
     * @param c to set the cancellation period
     */
    void setCancePeriod(String c)
    {
        cancelPeriod = c;
    }

    /**
     *
     * @param n to set the name of the playground
     */
    void setNamePlayground(String n)
    {
        namePlayground = n;
    }

    /**
     *
     * @param s to set size
     */
    void setSize(String s)
    {
        size = s;
    }

    /**
     *
     * @param p to set price of the playground per hour
     */
    void setPrice(int p)
    {
        price = p;
    }

    /**
     *
     * @param i to set the number of the playground
     */
    void setIndex(int i)
    {
        index = i;
    }

    /**
     *
     * @param r to set the rate of the plaground
     */
    void setRate(float r)
    {
        rate=r;
    }

    /**
     *
     * @return to get the hours
     */
    String getHours()
    {
        return hours;
    }

    /**
     *
     * @returnn to get the cancellation period
     */
    String getCancePeriod()
    {
        return cancelPeriod;
    }

    /**
     *
     * @return to get the name of the playground
     */
    String getNamePlayground()
    {
        return namePlayground;
    }

    /**
     *
     * @return to get size of the playground
     */
    String  getSize()
    {
        return size;
    }

    /**
     *
     * @return to get the price of the playground
     */
    int  getPrice()
    {
        return price;
    }

    /**
     *
     * @return to grt the rate of the playground
     */
    float getRate()
    {
        return rate;
    }

    /**
     *
     * @return to get the number of the playground in the system
     */
    int getIndex()
    {
        return index;
    }



    void displayPlayground()
    {
        System.out.println("The playground name is " + namePlayground);
        System.out.println("The available hours is " + hours);
        System.out.println("The size of the playground is "+ size);
        System.out.println("Price/hour is " + price);
        System.out.println("the playground's rate is " + rate);
        System.out.println("The cancellation period is " + cancelPeriod);


    }

}
