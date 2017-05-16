package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код

        HashMap<Character, Integer> myMap = createMap(alphabet);

        countChars(list,myMap);

        for (Character c: alphabet) {
            System.out.println(c + " " + myMap.get(c));

        }



    }

    public static void lookup (String s, HashMap<Character, Integer> charMap) {
        for (int i = 0; i < s.length(); i++) {

            char symbol = s.charAt(i);
            if (symbol != ' ') {
                int counter = charMap.get(symbol);
                charMap.put(symbol, ++counter);
            }

        }

    }

    public static HashMap<Character, Integer> createMap (ArrayList<Character> alphabet) {
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (Character symbol: alphabet) {
            charMap.put(symbol, 0);
        }


        return charMap;
    }

    public static void countChars (ArrayList<String> list, HashMap<Character, Integer> charMap ) {
        for (String s: list) {
            lookup(s, charMap);

        }

    }
}
