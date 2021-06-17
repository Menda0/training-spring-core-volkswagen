package com.training.spring.core.volkswagen.car;

public class Tyres {
    // Soft, Ultra Soft, Hyper Soft, Snow, Rain, Slick
    private String type;
    // Michelin, Pirelli, Continental
    private String brand;

    public Tyres(String type, String brand) {
        this.type = type;
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
