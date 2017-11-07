package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int x = vvod();
        int y = vvod();
        int z = vvod();
        int sumN = 0;
        if (x > 0)
            sumN = sumN + 1;
        if (y > 0)
            sumN = sumN + 1;
        if (z > 0)
            sumN = sumN + 1;

        System.out.println(sumN);
    }
    public static int vvod() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        int num = Integer.parseInt(x);
        return num;

    }
}
