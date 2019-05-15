package com.inducesmile.taxirental.models;
import com.inducesmile.taxirental.exception.CustomerAlreadyExistsException;
import com.inducesmile.taxirental.exception.CustomerNotFoundException;

import java.util.ArrayList;
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static final ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID=0;

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }
    public static boolean addCustomer (Customer customer) throws CustomerAlreadyExistsException
    {
        int count=0;
        boolean value=true;
        for (Customer i : CUSTOMER_DATABASE)
        {
            if(i.getName().equals(customer.getName())&& i.getEmail().equals(customer.getEmail()))
            {
                count=1;
                throw new CustomerAlreadyExistsException(customer);
            }
        }
        if (count==0)
        {
            CUSTOMER_DATABASE.add(customer);
            LAST_CUSTOMER_ID=customer.getId();
        }
        return value;
    }
    public static Customer getCustomer (int id)
    {
        Customer value=null;
        for (Customer i:CUSTOMER_DATABASE)
        {
            if (i.getId()==id)
            {
                value= i;
            }
        }
        return value;
    }
    public static Customer getCustomerLogin (String email, String password)
    {
        Customer value=null;
        for (Customer i:CUSTOMER_DATABASE)
        {
            if ((i.getEmail().equals(email))&&(i.getPassword().equals(password)))
            {
                value= i;
            }
        }
        return value;
    }
    public static boolean removeCustomer (int id) throws CustomerNotFoundException
    {
        for (Customer i : CUSTOMER_DATABASE)
        {
            if(i.getId()==id)
            {
                CUSTOMER_DATABASE.remove(i);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

}
