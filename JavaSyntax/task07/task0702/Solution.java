package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String m = bufferedReader.readLine();

        String[] s = new String[10];
        for(int i = 0; i<8; i++ ) {
            s[i] = m;
            if(i<7)
            m = bufferedReader.readLine();
        }
        for(int b = 0; b<10; b++){
            System.out.println(s[9-b]);
        }
    }
}