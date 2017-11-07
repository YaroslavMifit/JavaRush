package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
    while (true) {
        String s1 = bufferedReader.readLine();

        if (s1.equals("exit")) break;

        try {
            if (s1.contains(".")){
                Double ss = Double.parseDouble(s1);
                print(ss);
            }

            else if (Integer.parseInt(s1) < 128 && Integer.parseInt(s1) >0){
                Short ss = Short.parseShort(s1);
                print(ss);
            }

            else if (Integer.parseInt(s1)<= 0 || Integer.parseInt(s1)>= 128){
                Integer ss = Integer.parseInt(s1);
                print(ss);
            }

        } catch (Exception e) {
            print(s);
        }

    }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
