package com.bridgelabz;

import org.json.JSONObject;

public class JsonMerger {
    public static void main(String[] args) {
        String jsonString1 = "{\"name\":\"Alice\",\"age\":25}";
        JSONObject jsonObject1 = new JSONObject(jsonString1);
        String jsonString2 = "{\"math\":90,\"english\":85}";
        JSONObject jsonObject2 = new JSONObject(jsonString2);

        JSONObject mergerJsonObject = new JSONObject(jsonObject1.toString());
        for (String key: jsonObject2.keySet()){
            mergerJsonObject.put(key, jsonObject2.get(key));
        }

        System.out.println("Merged JSON object: " + mergerJsonObject.toString(2));

    }
}
