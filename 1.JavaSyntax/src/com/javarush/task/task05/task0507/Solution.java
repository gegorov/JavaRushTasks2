package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = 0;
        boolean trigger = true;

        int sum = 0;
        int counter = 0;
        while (trigger) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = Integer.parseInt(reader.readLine());
            if ( a == -1) {
                trigger = false;
            }
            else {
                sum += a;
                counter++;
            }

        }

        System.out.println(((double)sum / counter));

    }


}

