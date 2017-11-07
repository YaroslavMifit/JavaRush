package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int x = vvod();
        int y = vvod();
        int z = vvod();
        int sumP = 0;
        int sumN = 0;
        if (x < 0)
            sumN = sumN + 1;
        else if(x > 0)
            sumP = sumP + 1;
        if (y < 0)
            sumN = sumN + 1;
        else if(y > 0)
            sumP = sumP + 1;
        if (z < 0)
            sumN = sumN + 1;
        else if(z > 0)
            sumP = sumP + 1;
        System.out.println("количество отрицательных чисел: " + sumN);
        System.out.println("количество положительных чисел: " + sumP);
    }
    public static int vvod() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        int num = Integer.parseInt(x);
        return num;

    }
}
