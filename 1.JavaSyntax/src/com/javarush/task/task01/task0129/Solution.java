package com.javarush.task.task01.task0129;

/* 
Считаем длину окружности
*/

public class Solution {
    static final double PI = 3.14;

    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        //напишите тут ваш код
        double result = PI * radius * 2;
        System.out.println(result);
    }
}