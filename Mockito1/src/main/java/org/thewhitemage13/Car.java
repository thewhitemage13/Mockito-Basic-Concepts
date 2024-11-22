package org.thewhitemage13;

import java.util.ArrayList;

public class Car {
    private String manufacturer;
    private String number;
    private int year;
    private String owner;
    private ArrayList<String> owners = new ArrayList<>();

    public Car(String manufacturer, String number, int year, String owner) {
        this.manufacturer = manufacturer;
        this.number = number;
        this.year = year;
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<String> getOwners() {
        return owners;
    }

    public void setOwners(ArrayList<String> owners) {
        this.owners = owners;
    }

    public int testInt(int a) {
        return a + 4;
    }
}
