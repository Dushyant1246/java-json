package com.bridgelabz;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ValidateJson {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("src/main/resources/jsonData.json"));

        if (!root.has("name") || !root.get("name").isTextual()) {
            throw new RuntimeException("Missing or invalid 'name'");
        }

        if (!root.has("age") || !root.get("age").isInt()) {
            throw new RuntimeException("Missing or invalid 'age'");
        }

        if (!root.has("email") || !root.get("email").isTextual()) {
            throw new RuntimeException("Missing or invalid 'email'");
        }

        System.out.println("JSON is valid");
    }
}
