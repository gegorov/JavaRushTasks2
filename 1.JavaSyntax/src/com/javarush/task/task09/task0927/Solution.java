package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    static final int MAX_CAT = 10;

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        
        HashMap<String, Cat> catHashMap = new HashMap<>();

        for (int i = 0; i < MAX_CAT ; i++) {
            String name = "Marsik" + (int) (Math.random() * 100);
            Cat cat = new Cat(name);
            catHashMap.put(name, cat);
        }
        
        return catHashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> catHashSet = new HashSet<>();

        for(Map.Entry<String, Cat> entry : map.entrySet()) {

            catHashSet.add(entry.getValue());
        }
        
        return catHashSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
