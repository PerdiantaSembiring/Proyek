package com.inducesmile.taxirental.exception;

import com.inducesmile.taxirental.models.Customer;

public class CustomerAlreadyExistsException extends Exception
{
    // instance variables - replace the example below with your own
    private Customer customer_error;

    /**
     * Constructor for objects of class SupplierAlreadyExistsEsception
     */
    public CustomerAlreadyExistsException(Customer customer_input)
    {
        // initialise instance variables
        super("Customer email:");
        customer_error=customer_input;
    }
    public String getExtMessage()
    {
        String string =super.getMessage()+customer_error.getEmail();
        string += " ,or username: " + customer_error.getUsername();
        string += "already exists.";
        return string;
    }
}