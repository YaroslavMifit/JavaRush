package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = -1;
        int b = -1;
        a = Integer.valueOf(reader.readLine());
        if (a <= 0)
            throw new NumberFormatException();
        b = Integer.valueOf(reader.readLine());
        if (b <= 0)
            throw new NumberFormatException();
        int max = a > b? a: b;
        int min = a < b? a: b;

        while (min != max) {
            int diff = max - min;
            max = diff > min? diff: min;
            min = diff < min? diff: min;
        }
        System.out.println(max);
    }
}



