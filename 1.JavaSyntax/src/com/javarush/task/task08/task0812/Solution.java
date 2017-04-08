package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int maxSeq = 1;
        int count = 1;

        ArrayList<Integer> myList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            myList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 1; i < 10; i++) {
            if (myList.get(i - 1) == myList.get(i)) {
                count++;
            } else{
                if (count > maxSeq) {
                    maxSeq = count;
                }
                count = 1;
            }
            if (count > maxSeq) {
                maxSeq = count;
            }

        }

        System.out.println(maxSeq);

    }


}