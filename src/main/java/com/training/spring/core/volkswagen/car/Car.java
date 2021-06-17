package com.training.spring.core.volkswagen.car;

public class Car {

    // Tesla, Ford, Ferrari, Volkswagen. Porche
    private String brand;
    // GT, X, Y, Caynem
    private String model;

    private Tyres tyres;

    public Car() { }

    public Car(String brand, String model, Tyres tyres){
        this.brand = brand;
        this.model = model;
        this.tyres = tyres;
    }

    public void init(){
        System.out.println("The car "+this+" was initialized");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", tyres=" + tyres +
                '}';
    }
}
