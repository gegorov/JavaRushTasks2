package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        //напишите тут ваш код
        double dCelsium = (double)celsium;
        final double  farenheit = (9  * dCelsium  / 5 + 32 );

        return farenheit;

    }
}