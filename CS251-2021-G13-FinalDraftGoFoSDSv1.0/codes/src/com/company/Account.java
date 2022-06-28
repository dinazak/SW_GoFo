package com.company;

import java.util.Scanner;
/**
 *
 * @author Malak Amr Mostafa (20190551)
 */
public class Account {

    private String name, id,mail ,phone,pass;


    public Account()
    {
        name="";
        id="";
        mail="";
        phone="";
        pass="";
    }

    /**
     *
     * @return the id of the user
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id of the user
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return Email of the user
     */
    public String getMail() {
        return mail;
    }

    /**
     *
     * @return phone number of the user
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @return password of the user
     */
    public String getPass() {
        return pass;
    }

    /**
     *
     * @param pass which represents the password of the user
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     *
     * @param phone which represents the phone number of the user
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @param mail which represents the email of the user
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     *
     * @return name of the user
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name which represents the name of the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param name which represents the name of the user
     * @param id which represents the id of the user
     * @param mail which represents the email of the user
     * @param phone which represents the phone number of the user
     * @param pass which represents the password of the user
     */
    public Account (String name, String id, String mail , String phone, String pass)
    {
        this.name=name;
        this.id=id;
        this.mail=mail;
        this.phone=phone;
        this.pass=pass;
    }

}