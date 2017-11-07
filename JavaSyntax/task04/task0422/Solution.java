package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String Age1 = bufferedReader.readLine();
        int Age = Integer.parseInt(Age1);

        if (Age < 18)
            System.out.println("Подрасти еще");


    }
}
