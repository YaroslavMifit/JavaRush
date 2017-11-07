package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        double i = 1;

        while (a!=-1) {
            sum = sum + a;
            i++;
            a = Integer.parseInt(bufferedReader.readLine());
        }
        if(i==1)
        System.out.println(sum/i);
        else System.out.println(sum/(i-1));


            }
        }

