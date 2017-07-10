package com.javarush.task.task14.task1419;

import javax.management.ListenerNotFoundException;
import javax.management.openmbean.OpenDataException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.FormatterClosedException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] i = {0, 1};
            int b = i[2];

        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new IllegalAccessException() );
        exceptions.add(new IllegalArgumentException() );
        exceptions.add(new IllegalMonitorStateException() );
        exceptions.add(new InstantiationException());
        exceptions.add(new FormatterClosedException());
        exceptions.add(new OpenDataException());



        //напишите тут ваш код

    }
}

//java.lang.ArithmeticException
//        java.lang.NumberFormatException
//        java.lang.ArrayIndexOutOfBoundsException
//        java.lang.StringIndexOutOfBoundsException
//        java.lang.NullPointerException
//        java.lang.ArrayStoreException
//        java.lang.ClassCastException
//        java.lang.IllegalArgumentException
//        java.lang.NegativeArraySizeException
//        java.io.FileNotFoundException