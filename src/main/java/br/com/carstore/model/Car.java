package br.com.carstore.model;

public class Car {
    private String name;

    public Car(String carName) {
        this.name = carName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
