package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    final static int MAX_LINES = 40;
    public static void main(String[] args) {

        String s = "Я не хочу изучать Java, я хочу большую зарплату";


        //напишите тут ваш код
        for (int i = 0; i < MAX_LINES ; i++) {
            System.out.println(s.substring(i));

        }
    }

}

