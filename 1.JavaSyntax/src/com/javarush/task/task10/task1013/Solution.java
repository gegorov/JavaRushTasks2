package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private int age;
        private boolean sex;
        private int weight;
        private int height;


        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, boolean sex, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, boolean sex, int weight, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }


        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(boolean sex, int weight) {
            this.sex = sex;
            this.weight = weight;
        }

        public Human(boolean sex, int weight, int height) {
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }
    }
}
