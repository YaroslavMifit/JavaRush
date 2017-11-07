package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String st = bufferedReader.readLine();

        String[] s = new String[10];
        int[] i = new int[10];

        for (int q = 0; q<10;q++){
            s[q] = st;
            i[q] = s[q].length();

            if (q<9)
                st = bufferedReader.readLine();
        }

        for (int q = 0; q<10; q++){
            System.out.println(i[q]);
        }
    }
}
