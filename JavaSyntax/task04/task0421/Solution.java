package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s1 = r.readLine();
        String s2 = r.readLine();

        if (s1.equals(s2))
            System.out.print("Имена идентичны");
        else if (s1.length() == s2.length())
            System.out.print("Длины имен равны");
    }
}
