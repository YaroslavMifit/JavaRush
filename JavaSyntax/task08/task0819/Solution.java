package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set cats = createCats();
        Iterator it = cats.iterator();
        while(it.hasNext()){
            cats.remove(it.next());  //удаляем первого попавшегося кота, а потом break
            break;
        }
        printCats(cats);
    }

    public static Set createCats() {
        Set cats = new HashSet();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set cats) {
        Iterator it = cats.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static class Cat{

    }
}
