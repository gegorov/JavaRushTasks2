package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("robo" + i, i * 100);

        }

        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copyMap = new HashMap<>();
        copyMap.putAll(map);

        for (HashMap.Entry<String, Integer>  entry : copyMap.entrySet()) {
            if (entry.getValue() < 500) {
                map.remove(entry.getKey());

            }

        }
//    валидатор не любит лямбды, но с ними код тоже рабочий
//        copyMap.forEach((key, value) -> {
//            if(value<500) map.remove(key);
//        });
    }

    public static void main(String[] args) {

//        HashMap<String, Integer> map = createMap();
//
//        System.out.println(map.toString());
//
//        removeItemFromMap(map);
//
//        System.out.println(map.toString());



    }
}