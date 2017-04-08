package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> result = new HashMap<String, String>();

        result.put("Clinton", "Bill");
        result.put("Washington", "Georg");
        result.put("Jefferson", "Thomas");
        result.put("Obama", "Barak");
        result.put("Bush", "Georg");
        result.put("Trump", "Donald");
        result.put("Nixon", "Richard");
        result.put("Kennedy", "John");
        result.put("Eisenhower", "Dowight");
        result.put("Clinton", "Hillary");



        return result;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
