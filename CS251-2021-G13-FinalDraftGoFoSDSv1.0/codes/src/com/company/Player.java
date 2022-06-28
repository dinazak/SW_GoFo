package com.company;
/**
 *
 * @author Malak Amr Mostafa (20190551)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Player {

    private Account A;
    private String Location ;
    public Ewallet e=new Ewallet();
    private PlaygroundsFilter pf;
    public ArrayList<Bookings> bookings = new ArrayList<Bookings>();
    Scanner in = new Scanner(System.in);

    /**
     *
     * @param A which represents account of player
     * @param location which represents location of player
     */
    public Player(Account A, String location)
    {
        this.A=A;
        this.Location=location;
    }

    /**
     *
     * @param time which represents the time of the booking
     * @param date which represents the date of booking
     * @param p which represents the playground that the player booked
     */
    public void book(String time,String date,Playground p)
    {

        if(e.pay(p.getPrice()))
        {
            Bookings b=new Bookings(date,time, p.getNamePlayground());
            bookings.add(b);
            System.out.println("confirmed");
        }

    }

    /**
     * This function displays all the info of the bookings of the player
     */
    public void displayBookings()
    {
        if(bookings.size()==0)
        {
            System.out.println("there is no bookings");
        }
        else {
            for (int i = 0; i < bookings.size(); i++) {
                System.out.println("name of playground: ");
                System.out.println(bookings.get(i).namePlayground);
                System.out.println("Date: ");
                System.out.println(bookings.get(i).date);
                System.out.println("Time: ");
                System.out.println(bookings.get(i).hour);
            }
        }
    }






}
