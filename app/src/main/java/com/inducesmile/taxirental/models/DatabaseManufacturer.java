package com.inducesmile.taxirental.models;


import com.inducesmile.taxirental.exception.ManufacturerAlreadyExistsException;
import com.inducesmile.taxirental.exception.ManufacturerNotFoundException;

import java.util.ArrayList;
public class DatabaseManufacturer
{
    // instance variables - replace the example below with your own
    private static final ArrayList<Manufacturer> MANUFACTURER_DATABASE = new ArrayList<>();
    private static int LAST_SUPPLIER_ID=0;
    public static ArrayList<Manufacturer> getSupplierDatabase()
    {
        return MANUFACTURER_DATABASE;
    }
    public static int getLastManufacturerID()
    {
        return LAST_SUPPLIER_ID;
    }
    public static boolean addSupplier (Manufacturer manufacturer) throws ManufacturerAlreadyExistsException
    {
        int count=0;
        boolean value=true;
        for (Manufacturer i : MANUFACTURER_DATABASE)
        {
            if(i.getName().equals(manufacturer.getName()))
            {
                count=1;
                throw new ManufacturerAlreadyExistsException(i);
            }
        }
        if (count==0)
        {
            MANUFACTURER_DATABASE.add(manufacturer);
            LAST_SUPPLIER_ID=manufacturer.getId();
        }
        return value;
    }
    public static Manufacturer getSupplier (int id)
    {
        Manufacturer value=null;
        for (Manufacturer i:MANUFACTURER_DATABASE)
        {
            if (i.getId()==id)
            {
                value= i;
            }
        }
        return value;
    }
    public static boolean removeSupplier (int id) throws ManufacturerNotFoundException
    {
        for (Manufacturer i : MANUFACTURER_DATABASE)
        {
            if(i.getId()==id)
            {
                MANUFACTURER_DATABASE.remove(i);
                return true;
            }
        }
        throw new ManufacturerNotFoundException(id);
    }

}
