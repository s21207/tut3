package com.company;

import org.w3c.dom.ls.LSOutput;

import java.nio.file.FileSystemNotFoundException;

public class Main {

    public static void main(String[] args) {
        Airplane MyAirplane = new Airplane("Turkish Airlines", 500);


        String brand = MyAirplane.getBrand();
        System.out.println("The brand of the airplane is " + brand);

        double oldNumberofSeats = MyAirplane.getNumberofSeats();
        System.out.println("Number of seats before update: " + oldNumberofSeats);
        MyAirplane.setNumberofSeats(700);
        double newNumberofSeats = MyAirplane.getNumberofSeats();
        System.out.println("Number of seats after update: " + newNumberofSeats);


        Engine MyEngine = new Engine(52416, 2015);


        int productionYear = MyEngine.getProductionYear();
        System.out.println("The production year of the airplane's engine is " + productionYear);


        double enginePower = MyEngine.getPower();
        System.out.println("Engine's power is: " + enginePower);


        boolean isEcological; /* for further usage */
        if (enginePower > 20000 && productionYear > 2000) {
            System.out.println("The engine is ecological");
            isEcological = true;
        } else {
            System.out.println("The engine isn't ecological");
            isEcological = false;
        }
    }
}