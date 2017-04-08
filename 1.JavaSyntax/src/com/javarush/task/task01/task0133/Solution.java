package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        //напишите тут ваш код
        final int secondsInMinute = 60;
        final int secondsInHour = secondsInMinute * 60;

//        int countHour = seconds / secondsInHour;
//        return seconds - countHour * secondsInHour;
        return seconds % secondsInHour;

    }
}