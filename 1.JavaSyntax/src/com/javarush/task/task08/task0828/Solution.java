package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<String> months = new ArrayList<>(Arrays.asList(new DateFormatSymbols(Locale.ENGLISH).getMonths()));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String mon = reader.readLine();

        System.out.printf("%s is %s month", mon, months.indexOf(mon) + 1);


    }
}


//"January",
//        "February",
//        "March",
//        "April",
//        "May",
//        "June",
//        "July",
//        "August",
//        "September",
//        "October",
//        "September",
//        "November",
//        "December"));

