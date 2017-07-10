package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> myArrList1  = new ArrayList<String>();
        myArrList1.add("Мама мыла раму");
        myArrList1.add("Мама помыла раму");

        ArrayList<String> myArrList2  = new ArrayList<String>();
        myArrList2.add("Папа мыл раму");
        myArrList2.add("Папа помыл раму");


        ArrayList<String>[] myArr = new ArrayList[]{myArrList1,myArrList2};



        return myArr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}