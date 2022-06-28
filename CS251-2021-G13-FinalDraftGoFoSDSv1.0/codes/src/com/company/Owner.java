package com.company;
/**
 *
 * @author Malak Amr Mostafa (20190551)
 */
import java.util.ArrayList;


public class Owner {

    private Account A;
    private Ewallet e;
    public ArrayList<Playground> playgrounds = new ArrayList<Playground>();

    /**
     *
     * @param A which represents account of the playground owner
     */
    public Owner(Account A)
    {
        this.A = A;
    }

    /**
     *
     * @param obj which is the new playground added
     * @return a confrimtion message that the playground has been added
     */
    public String addPlayground(Playground obj)
    {
        playgrounds.add(obj);
        return "Playground is added successfully";
    }

    /**
     * This function displays the all playgrounds added by this owner
     */
    public void displayPlaygrounds()
    {
        for(int i=0;i<playgrounds.size();i++)
        {
            System.out.println(playgrounds.get(i));
        }
    }


}
