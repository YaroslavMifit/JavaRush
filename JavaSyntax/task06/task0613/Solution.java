package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

import java.io.IOException;

public class Solution {
    static void main(String[] args) throws IOException
    {
        for (int i  = 0; i < 10; i ++)
        {
            Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);
    }
    public static class Cat
    {
        public static int catCount = 0;
        public Cat()
        {
            catCount++;
        }
    }
}