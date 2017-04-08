package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        int number;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        number = Integer.parseInt(reader.readLine());
        checkNumber(number);

        System.out.println("Even: " + even + " Odd: " + odd);

    }

    public static void checkNumber(int number) {
        //напишите тут ваш код

        while (number > 0) {
             if ( (number % 10) % 2 == 0 ) {
                 even++;
             } else {
                 odd++;
             }
            number = number / 10;
        }

    }
}
