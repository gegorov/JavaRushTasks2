package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();



        String name;
        int id;
        boolean trigger = true;

        do {
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                break;
            }

            name = reader.readLine();

            if (name.isEmpty() ) {
                trigger = false;
            } else {
                hashMap.put(name, id);
            }
        } while (trigger);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey() );
        }

    }
}
