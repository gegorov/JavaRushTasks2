package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        inputString = inputString.replace(" ", "");

        StringBuffer vovel = new StringBuffer();
        StringBuffer nVovel = new StringBuffer();
        for (int i = 0; i < inputString.length(); i++) {
            char x = inputString.charAt(i);

            if (isVowel(x)) {
                vovel.append(x);
                vovel.append(" ");
            } else {
                    nVovel.append(x);
                    nVovel.append(" ");
            }

        }

        System.out.println(vovel);
        System.out.println(nVovel);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}