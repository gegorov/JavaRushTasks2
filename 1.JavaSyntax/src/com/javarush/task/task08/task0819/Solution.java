package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);

        for (Cat cat: cats) {
            cats.remove(cat);
            break;

        }
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> kotiki = new HashSet<Cat>();

//        for (int i = 0; i < 3; i++) {
//            Cat murzik = new Cat("name" + i);
//            kotiki.add(murzik);
//
//        }

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();


        kotiki.add(cat1);
        kotiki.add(cat2);
        kotiki.add(cat3);

        return kotiki;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4

        for (Cat cat: cats) {
            System.out.println(cat.toString());

        }
    }

    // step 1 - пункт 1

    public static class Cat{
//        private String name;
//
//        public Cat(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return this.getName();
//        }
    }
}
