package com.training.spring.core.volkswagen.car;

public class Engine {

    // Electric, Fuel, Hybrid
    private String type;

    // Diesel, Battery, Diesel Battery
    private String fuel;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
