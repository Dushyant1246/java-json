package com.bridgelabz.objectToJson;

public class Car {
    private String model;
    private String color;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}