package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.0,"blabla0");
        labels.put(2.1,"blabla1");
        labels.put(2.2,"blabla2");
        labels.put(2.3,"blabla3");
        labels.put(2.4,"blabla4");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
