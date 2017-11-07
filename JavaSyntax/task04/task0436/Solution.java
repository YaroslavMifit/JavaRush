package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        int i = Integer.parseInt(s);
        int i1 = Integer.parseInt(s1);
        for (int n =1;n<=i;n++) {
            for (int a = 1; a <= i1; a++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
