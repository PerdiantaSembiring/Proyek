package com.inducesmile.taxirental.models;

public enum CarStatus
{
    New("Upcoming"),
    Second("Complete"),
    Refurbished("Cancelled");
    private String value;
    private CarStatus(String value)
    {
        this.value=value;
    }
    public String toString()
    {
        return value;
    }
}