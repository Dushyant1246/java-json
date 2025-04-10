package com.bridgelabz;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class JsonFilePrinter {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("src/main/resources/jsonData.json"));
        Iterator<String> it = jsonNode.fieldNames();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key + ": " + jsonNode.get(key));
        }
    }
}
