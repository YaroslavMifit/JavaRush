package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList cats = new ArrayList();

    public Cat() {
    }

    public static void main(String[] args) {
        Cat.cats = new ArrayList();

        for(int i = 1; i<=10; i++)
            Cat.cats.add(new Cat());
        printCats();
    }

    public static void printCats() {
        for (Object c: Cat.cats)
            System.out.println(c.toString());
    }
}
