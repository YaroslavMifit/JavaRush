package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();
        Human child1 = new Human("сынка1", true, 25);
        Human child2 = new Human("дочка", false, 20);
        Human child3 = new Human("сынка2", true, 17);
        children.add(child1);
        children.add(child2);
        children.add(child3);

        ArrayList<Human> fatherParents = new ArrayList<>(); // Создаем список детей для Деда1 и Бабки1 (их сын будет батя)
        ArrayList<Human> motherParents = new ArrayList<>(); // Создаем список детей для Деда2 и Бабки 2 (их дочка будет мамка)

        Human father = new Human("Батя", true, 50, children);
        Human mother = new Human("Мамка", false, 50, children);

        fatherParents.add(father); // Добавили батю в список детей для Деда1 и Бабки1
        motherParents.add(mother); // Добавили мамку в список детей для Деда2 и Бабки2

        Human grandpa1 = new Human("Дед1", true, 75, fatherParents);
        Human grandpa2 = new Human("Дед2", true, 78, motherParents);
        Human grandma1 = new Human("Бабка1", false, 75, fatherParents);
        Human grandma2 = new Human("Бабка2", false, 78, motherParents);

        System.out.println(grandpa1);
        System.out.println(grandma1);
        System.out.println(grandpa2);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();



        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        public Human(String name, boolean sex, int age) {
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
