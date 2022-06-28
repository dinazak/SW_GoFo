package com.company;


/**
 *
 * @author mina samy (20190571)
 */



import java.util.ArrayList;
import java.util.Scanner;

public class _System {

    public ArrayList<Playground> allPlaygrounds= new ArrayList<Playground>();


    public _System()
    {
        while(true) {
            System.out.println("1-Register as a player");
            System.out.println("2-Register as a playground owner");
            System.out.println("3-Exit");
            int choice= in.nextInt();
            if(choice==1 || choice==2) {
                loginForm(choice);
            }
            else{
                break;
            }
        }
    }

    Scanner in = new Scanner(System.in);

    /**
     *
     * @param index number of the chosen playground in the ArrayList
     */
    public void loginForm(int index)
    {
        Boolean check=false;
        while(true)
        {
            if(check==true)
            {
                break;
            }
            Account A = new Account();

            System.out.println("Please enter your name");
            String name = in.next();
            A.setName(name);
            System.out.println("Please enter your password");
            String pass = in.next();
            A.setPass(pass);
            System.out.println("Please enter your id");
            String id=in.next();
            A.setId(id);
            System.out.println("Please enter your phone");
            String phone=in.next();
            A.setPhone(phone);
            System.out.println("Please enter your Email");
            String mail=in.next();
            A.setPhone(mail);
            if(index==1)
            {
                System.out.println("Please enter your location");
                String Location=in.next();
                Player p = new Player (A,Location);
                System.out.println("You are now registered as a player");
                while(true)
                {
                    System.out.println("1-Display playgrounds ");
                    System.out.println("2-View Bookings ");
                    System.out.println("3-Add money ");
                    System.out.println("4-Exit");
                    int choice = in.nextInt();
                    if(choice ==1)
                    {

                        for(int i=0; i<allPlaygrounds.size(); i++)
                        {
                            System.out.println(i+1);
                            allPlaygrounds.get(i).displayPlayground();

                        }
                        System.out.println("1-Book a playground ");
                        System.out.println("2-Exit");
                        choice = in.nextInt();
                        if(choice ==1)
                        {
                            System.out.println("choose the playground ");
                            int indx = in.nextInt();

                            System.out.println("Enter the date ");
                            String d=in.next();
                            System.out.println("Enter the time");
                            String t=in.next();
                            System.out.println("1-confirm booking");
                            System.out.println("2-Exit");
                            choice=in.nextInt();
                            if(choice==1)
                            {
                                p.book(t, d, allPlaygrounds.get(index - 1));
                            }
                            else
                            {

                                break;
                            }
                        }
                        else
                        {
                            break;
                        }
                    }

                    else if(choice==2)
                    {
                        p.displayBookings();
                    }
                    else if(choice==3)
                    {
                        System.out.println("Enter the amount");
                        int a=in.nextInt();
                        p.e.addMoney(a);
                    }
                    else
                    {
                        break;
                    }


                }
            }

            if(index==2)
            {

                Owner O = new Owner (A);
                System.out.println("You are now registered as a owner");
                while(true)
                {
                    System.out.println("1-Add a playground");
                    System.out.println("2-Exit");
                    int choice = in.nextInt();
                    if(choice == 1)
                    {
                        System.out.println("Enter the name of the playground ");
                        String playgroundName = in.next();
                        System.out.println("Enter the size of the playground ");
                        String size = in.next();
                        System.out.println("Enter the price for each hour");
                        int price = in.nextInt();
                        System.out.println("Enter the available hours ");
                        String hour = in.next();
                        System.out.println("Enter the duration of the cancelation period ");
                        String cancelationPeriod = in.next();
                        Playground p1 = new Playground(hour, cancelationPeriod, playgroundName,size , price );
                        O.addPlayground(p1);
                        allPlaygrounds.add(p1);
                    }
                    if (choice == 2)
                    {
                        check=true;
                        break;

                    }
                }
            }
        }

    }

}