package com.company;
/**
 *
 * @author dina zakaria moustafa (20190197)
 */


import java.util.ArrayList;
import java.util.ArrayList;


public class PlaygroundsFilter {

    String hour;
    String date;
    Owner obj;
    public ArrayList<Playground> filters = new ArrayList<Playground>();

    /**
     *
     * @param hour it is the time that the player want to search by it for playground
     * @param date it is the date that the player want to search by it for playground
     */
    public PlaygroundsFilter(String hour, String date)
    {
        this.date=date;
        this.hour=hour;
    }

    /**
     *
     * @param hour it is the time that the player want to search by it for playground
     * @param date it is the date that the player want to search by it for playground
     */
    public void filter(String hour, String date)
    {
        for (int i=0;i<obj.playgrounds.size();i++)
        {
            if(obj.playgrounds.get(i).getHours()==hour)
            {
                filters.add(obj.playgrounds.get(i));
            }
        }

    }

    /**
     *
     * @return return the playgrounds after filtering
     */
    public Playground displayPlaygrounds()
    {
        for(int i=0; i<filters.size()-1;i++) {
            return filters.get(i);
        }
        return filters.get(filters.size()-1);
    }
}
