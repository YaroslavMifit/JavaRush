package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] in = new int[15];
        int a,b;
        a =0;
        b = 0;

        for ( int q = 0; q <in.length; q ++){
            in[q] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int q = 0; q<15; q+=2){
            a+= in[q];
        }

        for (int q = 1; q<13; q+=2){
            b+= in[q];
        }
        if (b>a)
            System.out.println( "В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
