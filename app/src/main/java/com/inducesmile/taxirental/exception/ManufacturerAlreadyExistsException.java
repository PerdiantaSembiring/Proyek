package com.inducesmile.taxirental.exception;

import com.inducesmile.taxirental.models.Manufacturer;

public class ManufacturerAlreadyExistsException extends Exception
{
    // instance variables - replace the example below with your own
    private Manufacturer manufacturer_error;

    /**
     * Constructor for objects of class SupplierAlreadyExistsEsception
     */
    public ManufacturerAlreadyExistsException(Manufacturer manufacturer_input)
    {
        // initialise instance variables
        super("Supplier name:");
        manufacturer_error=manufacturer_input;
    }
    public String getExtMessage()
    {
        String string =super.getMessage()+manufacturer_error.getName();
        string += "already exists.";
        return string;
    }
}
