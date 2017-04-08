package com.javarush.task.task08.task0823;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        for (String str : s.split("\\b")) {

            System.out.print(str.replaceFirst(str.substring(0,1),str.substring(0,1).toUpperCase()));
        }


    }
}
