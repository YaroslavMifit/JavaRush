package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] s = new int[20];
        int[] s1 = new int[10];
        int[] s2 = new int[10];

        for(int i = 0; i<20; i++ ) {
           s[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for(int i =0; i<10;i++) {
            s1[i]= s[i];
            s2[i] = s[i+10];
            System.out.println(s2[i]);
        }
    }
}
