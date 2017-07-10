package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput;

        do {
            userInput = reader.readLine();

             if (checkInt(userInput)) {

                int myInt = Integer.parseInt(userInput);

                if (myInt > 0 && myInt < 128 ) {

                    print((short)myInt);

                } else if (myInt <= 0 || myInt >= 128  ) {

                    print(myInt);
                }


            } else if (checkDouble(userInput)) {

                print(Double.parseDouble(userInput));



            } else if (!"exit".equals(userInput)) {

                print(userInput);
            } else {
                 continue;
             }




        } while (!"exit".equals(userInput));




    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }

    //check string by every char if it is digit & if it contains '.'
    public static boolean checkDouble(String inputString) {

        try {

            Double.parseDouble(inputString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static boolean checkInt (String inputString) {

        try {
            Integer.parseInt(inputString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
