package com.company;
/**
 *
 * @author dina zakaria moustafa (20190197)
 */

public class Bookings {
    String namePlayground;
    String date;
    String hour;
    Player pl;
    Account a;

    /**
     *
     * @param hour, it is the time that the player want to book by it for playground
     * @param date, it is the date that the player want to book by it for playground
     * @param namePlayground, it is the name of the playground that the play want to book
     */
    public Bookings(String date,String hour,String namePlayground){
        this.namePlayground=namePlayground;
        this.date=date;
        this.hour=hour;

    }


}
