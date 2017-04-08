package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class SolutionB {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human kid1 = new HumanBuilder()
                .age(3)
                .name("Johnny")
                .sex(false)
                .build();


        Human kid2 = new HumanBuilder()
                .age(7)
                .name("Dora")
                .sex(false)
                .build();


        Human kid3 = new HumanBuilder()
                .age(6)
                .name("Ronny")
                .sex(true)
                .build();


        Human father = new HumanBuilder()
                .age(40)
                .name("Darth")
                .sex(true)
                .children(new ArrayList<>(Arrays.asList(kid1, kid2, kid3)))
                .build();


        Human mother = new HumanBuilder()
                .name("Fiona")
                .age(39)
                .sex(false)
                .children(father.getChildren())
                .build();



        Human gff = new HumanBuilder()
                .age(62)
                .name("Dark Lord")
                .sex(true)
                .children(new ArrayList<>(Arrays.asList(father)))
                .build();


        Human gmf = new HumanBuilder()
                .age(60)
                .sex(false)
                .name("Choobaka")
                .children(gff.getChildren())
                .build();

        Human gfm = new HumanBuilder()
                .age(65)
                .name("Padavan")
                .sex(true)
                .children(new ArrayList<>(Arrays.asList(mother)))
                .build();


        Human gmm = new HumanBuilder()
                .age(60)
                .sex(false)
                .name("Padme")
                .children(gfm.getChildren())
                .build();

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

    private static class Human {
        //напишите тут ваш код
        private final String name;
        private final boolean sex;
        private final int age;
        private final ArrayList<Human> children;


        Human(final HumanBuilder humanBuilder ) {
            this.name = humanBuilder.getName();
            this.sex = humanBuilder.isSex();
            this.age = humanBuilder.getAge();
            this.children = humanBuilder.getChildren();
        }

        public String getName() {
            return name;
        }

        public boolean getSex() {
            return sex;
        }

        public int getAge() {
            return age;
        }

        public ArrayList<Human> getChildren() {
            return children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.getName();
            text += ", пол: " + (this.getSex() ? "мужской" : "женский");
            text += ", возраст: " + this.getAge();

            int childCount = this.getChildren().size();
            if (childCount > 0) {
                text += ", дети: " + this.getChildren().get(0).getName();

                for (int i = 1; i < childCount; i++) {
                    Human child = this.getChildren().get(i);
                    text += ", " + child.getName();
                }
            }
            return text;
        }


    }

    public static class HumanBuilder {

        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        public HumanBuilder name (final String name) {
            this.name = name;
            return this;
        }
        public HumanBuilder sex (final boolean sex) {
            this.sex = sex;
            return this;
        }


        public HumanBuilder age (final int age) {
            this.age = age;
            return this;
        }

        public HumanBuilder children (final ArrayList<Human> children) {
            this.children = children;
            return this;
        }

        public String getName() {
            return name;
        }

        public boolean isSex() {
            return sex;
        }

        public int getAge() {
            return age;
        }

        public ArrayList<Human> getChildren() {
            return children;
        }

        public Human build() {
            return new Human(this);
        }
    }

}
