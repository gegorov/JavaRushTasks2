package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> myList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxLengthIndex = 0;
        int minLengthIndex = 0;

        for (int i = 0; i < 10; i++) {

            String line = reader.readLine();
            myList.add(line);

        }

        int maxLength = myList.get(0).length();
        int minLength = myList.get(0).length();


        for (String string : myList) {
            if (string.length() > maxLength) {
                maxLengthIndex = myList.indexOf(string);
                maxLength = string.length();
            }
            if (string.length() < minLength) {
                minLengthIndex = myList.indexOf(string);
                minLength =  string.length();
            }
        }

        if (maxLengthIndex < minLengthIndex) {
            System.out.println(myList.get(maxLengthIndex));
        } else {
            System.out.println(myList.get(minLengthIndex));
        }


    }
}
