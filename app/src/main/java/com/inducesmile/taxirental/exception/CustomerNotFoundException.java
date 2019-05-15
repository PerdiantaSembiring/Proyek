package com.inducesmile.taxirental.exception;

public class CustomerNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private int customer_error;

    /**
     * Constructor for objects of class SupplierNotFoundException
     */
    public CustomerNotFoundException(int customer_input)
    {
        // initialise instance variables
        super("Customer ID:");
        customer_error=customer_input;
    }

    public String getExtMessage()
    {
        String string =super.getMessage()+customer_error;
        string += "not found.";
        return string;
    }
}