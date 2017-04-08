package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String,String> addresses = new HashMap<>();
        while (true) {
            String family = reader.readLine();

            if (family.isEmpty()) {
                break;
            } else {
                String city = reader.readLine();
                addresses.put(city,family);
            }
        }

        //read city
        String city = reader.readLine();
        // search in the array

        for (Map.Entry<String, String> entry: addresses.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (city.equals(key)) {
                System.out.println(value);
            }
            
        }
    }
}
