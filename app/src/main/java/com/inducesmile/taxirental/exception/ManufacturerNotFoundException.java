package com.inducesmile.taxirental.exception;

import com.inducesmile.taxirental.models.Manufacturer;

public class ManufacturerNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private int manufacturer_error;

    /**
     * Constructor for objects of class SupplierNotFoundException
     */
    public ManufacturerNotFoundException(int manufacturer_input)
    {
        // initialise instance variables
        super("Supplier ID:");
        manufacturer_error=manufacturer_input;
    }
    public String getExtMessage()
    {
        String string =super.getMessage()+manufacturer_error;
        string += "not found.";
        return string;
    }
}
