package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            } else {
                addresses.add(family);
                //нечетные будут города
                addresses.add(reader.readLine());
            }
        }

        //read home number
        String city = reader.readLine();

        for (String entry: addresses) {
            if (city.equals(entry)) {
                System.out.println(addresses.get(addresses.indexOf(entry) - 1));
            }

        }

    }
}
