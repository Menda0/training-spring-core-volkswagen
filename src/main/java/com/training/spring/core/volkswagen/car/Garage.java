package com.training.spring.core.volkswagen.car;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> cars;

    public Garage(){
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    public Car getCar(int index){
        return this.cars.get(index);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}
