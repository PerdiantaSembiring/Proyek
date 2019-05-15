package com.inducesmile.taxirental.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.logging.SimpleFormatter;
import java.util.regex.*;
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;

    public Customer(String name, String email, String username, String password,  Calendar birthDate)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.birthDate=birthDate;
        this.id=DatabaseCustomer.getLastCustomerID()+1;
    }
    public Customer(String name, String email, String username, String password, int year, int month, int dayOfMonth)
    {
        // initialise instance variables
        this.id=DatabaseCustomer.getLastCustomerID()+1;
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.birthDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public int getId()
    {
        return id;
    }
    public Calendar getBirthDate()
    {
        //System.out.printf("%s %te %<tB %<tY", "Birth date: ", birthDate);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println("Birth date: " + df.format(birthDate.getTime()));
        return birthDate;

    }
    public void setName(String name )
    {
        //mengarahkan nilai parameter name ke variabel class name
        this.name=name;
    }
    public void setEmail(String email )
    {
        String pattern = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if(m.find()){
            System.out.println("Email: " + m.group());
            this.email = email;
        }else{
            System.out.println("Email: NULL");
            this.email = "NULL";
        }
    }
    public void setUsername(String username )
    {

        this.username=username;
    }
    public void setPassword(String password )
    {

        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if(m.find()){
            System.out.println("Password: " + m.group());
            this.password = password;
        }else{
            System.out.println("Password: NULL");
            this.password = "NULL";
        }
    }
    public void setId(int id )
    {

        this.id=id;
    }
    public void setBirthDate(Calendar birthDate)
    {
        this.birthDate=birthDate;
    }
    public void setBirthDate(int year, int month, int dayOfMonth)
    {
        //birthDate.set(year,month,dayOfMonth);
        GregorianCalendar birthDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    public String toString() {
        String string = "=====Customer=====";
        string += "\nID = " + id;
        string += "\nName = " + name;
        string += "\nEmail = " + email;
        string += "\nUsername = " + username;
        string += "\nPassword = " + password;
        string += "\nBirthdate = "+ getBirthDate().getTime();
        return string;
    }

}


