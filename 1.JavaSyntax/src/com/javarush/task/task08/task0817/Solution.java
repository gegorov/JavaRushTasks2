package com.javarush.task.task08.task0817;

import java.io.StringReader;
import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> myMap = new HashMap<String, String>();

        myMap.put("Gates", "Bill");
        myMap.put("Clinton", "Bill");
        myMap.put("Franklin","Ben");
        myMap.put("Washington","George");
        myMap.put("Bush","George");
        myMap.put("Raegan","Ronald");
        myMap.put("Obama","Barak");
        myMap.put("Nixon","Richard");
        myMap.put("Jeffersson","Thomas");
        myMap.put("Jackson","Mikel");

        return myMap;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy2.entrySet()) {
            int i = 0;
            for (Map.Entry<String, String> pair2 : copy2.entrySet()) {
                if (pair2.getValue().equals(pair.getValue()))
                    i++;
                if (i > 1) removeItemFromMapByValue(map, pair.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

        HashMap map;
        map = createMap();
        removeTheFirstNameDuplicates(map);


    }


}
