package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bufferedReader.readLine());

        int[] s = new int[10];
        for(int i = 0; i<10; i++ ) {
            s[i] = m;
            if(i<9)
                m = Integer.parseInt(bufferedReader.readLine());
        }
        for(int b = 0; b<10; b++){
            System.out.println(s[9-b]);
        }
    }
}

