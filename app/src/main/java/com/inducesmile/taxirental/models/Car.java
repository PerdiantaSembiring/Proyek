package com.inducesmile.taxirental.models;

import com.inducesmile.taxirental.models.CarStatus;
import com.inducesmile.taxirental.models.Manufacturer;

public class Car {
    private int id;
    private String name;
    private int price;
    private CarStatus status;
    private Manufacturer manufacturer;
    public Car(int id, String name, int price,CarStatus status,Manufacturer manufacturer )
    {
        // menginisiasi nilai awal dari setiap variabel
        this.name=name;
        this.price=price;
        this.status=status;
        this.manufacturer=manufacturer;
        this.id=id;
    }

    public String toString() {
        String string = "=====Item=====";
        string += "\nID = " + id;
        string += "\nName = " + name;
        string += "\nPrice = " + price;
        string += "\nStatus = "+ status;
        string += "\nManufacturer Name = "+ manufacturer.getName();
        return string;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

}
