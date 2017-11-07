package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int num, sum = 0;

        while(!a.equals("сумма")){
            sum += Integer.parseInt(a);
            a = reader.readLine();
        }
        System.out.println(sum);
    }
}
