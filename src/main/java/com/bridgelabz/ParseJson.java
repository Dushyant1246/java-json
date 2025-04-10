package com.bridgelabz;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ParseJson {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File("src/main/resources/data.json"));
            System.out.println("Records with age greater than 25: ");
            for (JsonNode node: jsonNode){
                if (node.get("age").asInt() > 25){
                    System.out.println(node);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
