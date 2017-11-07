package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++)
        {
            String s = bufferedReader.readLine();
            list.add(s);
        }

        int sum = list.get(0).length();
        for (int i = 0; i < list.size(); i++)
        {
            if (sum <= list.get(i).length())
            {
                sum = list.get(i).length();

            }
            else
                System.out.println(i);


        }
    }
}

