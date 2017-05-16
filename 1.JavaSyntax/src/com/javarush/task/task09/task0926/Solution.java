package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код 5, 2, 4, 7, 0
        ArrayList<int[]> myList = new ArrayList<>();
        final int[] ARR_LENGTH = {5, 2, 4, 7, 0};

        for (int i = 0; i < ARR_LENGTH.length; i++) {
            int[] array = new int[ARR_LENGTH[i]];

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 100);
            }

            myList.add(array);

        }

        return myList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
