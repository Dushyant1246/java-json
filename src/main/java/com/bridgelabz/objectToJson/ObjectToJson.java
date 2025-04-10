package com.bridgelabz.objectToJson;

import org.json.JSONObject;

public class ObjectToJson {
    public static void main(String[] args) {
        Car car = new Car("black", "A1");
        JSONObject jsonObject = new JSONObject(car);
        System.out.println(jsonObject);
    }
}