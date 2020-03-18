package com.company;

public class Airplane {
    String brand;
    double numberofSeats;

    public Airplane(String brand, double numberofSeats) {
        this.brand = brand;
        this.numberofSeats = numberofSeats;
    }
 public String getBrand  () {
        return this.brand;
    }

    public double getNumberofSeats () {
        return this.numberofSeats;
    }


    public void setNumberofSeats (double numberofSeats) {
        this.numberofSeats = numberofSeats;
    }





}
