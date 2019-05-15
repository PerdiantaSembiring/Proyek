package com.inducesmile.taxirental.exception;

import com.inducesmile.taxirental.models.Car;

public class CarAlreadyExistsException extends Exception
{
    // instance variables - replace the example below with your own
    private Car car_error;

    /**
     * Constructor for objects of class SupplierAlreadyExistsEsception
     */
    public CarAlreadyExistsException(Car car_input)
    {
        // initialise instance variables
        super("Item name:");
        car_error=car_input;
    }
    public String getExtMessage()
    {
        String string =super.getMessage()+car_error.getName();
        string += " Manufacturer: " + car_error.getManufacturer().getName();
        string += "already exists.";
        return string;
    }
}
