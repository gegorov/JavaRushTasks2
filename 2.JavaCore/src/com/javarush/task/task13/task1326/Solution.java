package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        ArrayList<Integer> myList = new ArrayList<Integer>();

        // читаем имя файла с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());


        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));


        while (fileReader.ready()) {
            myList.add(Integer.parseInt(fileReader.readLine()));
        }

        Collections.sort(myList);

        for (Integer num: myList) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        reader.close();
        fileReader.close();

    }
}
