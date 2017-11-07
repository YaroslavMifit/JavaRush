package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();
        int a = Integer.parseInt(name);
        String name1 = bufferedReader.readLine();
        int b = Integer.parseInt(name1);
        String name2 = bufferedReader.readLine();
        int c = Integer.parseInt(name2);

        if ((a+b > c) && (a+c > b) && (b+c > a))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}