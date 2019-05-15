package com.inducesmile.taxirental.exception;

public class CarNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private int car_error;
    public CarNotFoundException(int item_input)
    {
        // initialise instance variables
        super("Item ID:");
        car_error=item_input;
    }
    public String getExtMessage()
    {
        String string =super.getMessage()+car_error;
        string += "not found.";
        return string;
    }
}
