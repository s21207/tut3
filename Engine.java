package com.company;

import java.util.Date;

public class Engine {
    double enginePower;
int productionYear;

public Engine (double power, int productionYear) {
    this.enginePower = power;
    this.productionYear = productionYear;
}

public int getProductionYear () {
    return this.productionYear;
}

public double getPower () {
    return this.enginePower;
}

}
