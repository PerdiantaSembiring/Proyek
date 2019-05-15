package com.inducesmile.taxirental.models;
import java.util.regex.*;
public class Manufacturer
{
    // menginisiasi variable instance untuk class Supplier
    protected int id;
    protected String name;
    //protected String pattern = "^[+62][0-9]{8,12}+$";
    public Manufacturer(String name)
    {
        // menginisiasi nilai awal dari setiap variabel
        this.name=name;
//        String pattern = "^[+]62[0-9]{8,12}$";
//        Pattern p = Pattern.compile(pattern);
//        Matcher m = p.matcher(phoneNumber);
//        if(m.find()){
//            //System.out.println("phoneNumber: " + m.group());
//            this.phoneNumber = phoneNumber;
//        }else{
//            //System.out.println("phoneNumber: NULL");
//            this.phoneNumber = "Nomor telepon tidak benar";
//        }
        //this.phoneNumber=phoneNumber;
//        this.location=location;
        this.id=DatabaseManufacturer.getLastManufacturerID()+1;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int id)
    {
        //mengarahkan nilai parameter id ke variabel class id
        this.id=id;
    }
    public void setName(String name)
    {
        //mengarahkan nilai parameter name ke variabel class name
        this.name=name;
    }
    public String toString() {
        String string = "=====Manufacturer=====";
        string += "\nID = " + id;
        string += "\nName = " + name;
        return string;
    }

}
