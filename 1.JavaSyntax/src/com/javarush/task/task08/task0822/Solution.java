package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        int minimum = array.get(0);

        for (Integer number: array) {
            if (number < minimum) {

                minimum = number;

            }

        }

        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        int count;

        ArrayList<Integer> myList = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            myList.add(Integer.parseInt(reader.readLine()));
        }

        return myList;
    }
}
