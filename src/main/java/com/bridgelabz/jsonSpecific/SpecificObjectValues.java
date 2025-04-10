package com.bridgelabz.jsonSpecific;

import org.json.JSONObject;

public class SpecificObjectValues {
    public static void main(String[] args) {
        Student student = new Student(12, "example@gmail.com", "B", 77, "Roy", 101);
        JSONObject jsonObject = new JSONObject(student);
        System.out.println("Name: " + jsonObject.get("name"));
        System.out.println("Email: " + jsonObject.get("email"));
    }
}
