package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


        Human kid1 =new Human("blbl", true, 3);
        Human kid2 =new Human("blbl", false, 3);
        Human kid3 =new Human("blbl", true, 3);





        Human father =new Human("blbl", true, 39, new ArrayList<>(Arrays.asList(kid1, kid2, kid3)));

        Human mother =new Human("Fiona", false, 39, new ArrayList<>(Arrays.asList(kid1, kid2, kid3)));

        Human gff = new Human("Dark Lord", true,62, new ArrayList<>(Arrays.asList(father)));
        Human gmf = new Human("Choobaka",false, 60, new ArrayList<>(Arrays.asList(father)));

        Human gfm = new Human("Padavan", true, 65, new ArrayList<>(Arrays.asList(mother)));
        Human gmm = new Human("Padme", false, 65, new ArrayList<>(Arrays.asList(mother)));




//        kid1.age = 3;
//        kid1.name = "Johnny";
//        kid1.sex = true;
//
//        kid2.age = 7;
//        kid2.name = "Mary";
//        kid2.sex = false;
//
//        kid3.age = 3;
//        kid3.name = "Ronny";
//        kid3.sex = true;

//        father.age = 40;
//        father.name = "Darth";
//        father.sex = true;
//        father.children.add(kid1);
//        father.children.add(kid2);
//        father.children.add(kid3);
//
//        mother.age = 35;
//        mother.name = "Fiona";
//        mother.sex = false;
//        mother.children.add(kid1);
//        mother.children.add(kid2);
//        mother.children.add(kid3);

//        gff.age = 62;
//        gff.name = "Dark Lord";
//        gff.sex = true;
//        gff.children.add(father);
//
//        gmf.age = 60;
//        gmf.name = "Choobaka";
//        gmf.sex = false;
//        gmf.children.add(father);

//        gfm.age = 59;
//        gfm.name = "Padavan";
//        gfm.sex = true;
//        gfm.children.add(mother);
//
//        gmm.age = 58;
//        gmm.name = "Padme";
//        gmm.sex = false;
//        gmm.children.add(mother);


        System.out.println(gff.toString());
        System.out.println(gmf.toString());
        System.out.println(gfm.toString());
        System.out.println(gmm.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());

    }

    public  static class Human {
        //напишите тут ваш код
        public final String name;
        public final boolean sex;
        public final int age;
        public ArrayList<Human> children = new ArrayList<>();




        Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }


    }


}
