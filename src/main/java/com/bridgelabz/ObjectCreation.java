package com.bridgelabz;

import org.json.JSONObject;

public class ObjectCreation {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Alice");
        jsonObject.put("age", 23);
        jsonObject.put("subjects", new String[]{"maths", "english", "CS"});
        System.out.println(jsonObject);
    }
}
