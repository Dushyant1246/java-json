package com.bridgelabz.jsonArray;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArray {
    public static void main(String[] args) {
        Object[] objectList = {new Car("black", "A1"), new Car("white", "B2"), new Car("blue", "C3")};
        JSONArray jsonArray = new JSONArray();

        for (Object car: objectList){
            JSONObject obj = new JSONObject(car);
            jsonArray.put(obj);
        }

        System.out.println(jsonArray.toString(2));
    }
}
