package com.training.spring.core.volkswagen.car;

public class Tyres {
    // Soft, Ultra Soft, Hyper Soft, Snow, Rain, Slick
    private String type;
    // Michelin, Pirelli, Continental
    private String brand;

    public Tyres(){}

    public Tyres(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyres{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
