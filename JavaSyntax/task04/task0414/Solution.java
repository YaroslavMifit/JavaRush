package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        int x = Integer.parseInt(number1); //преобразовываем строку в число.
        int y;
        if (x%400 !=0 && x%100==0)
            y = 365;
        else if (x%4==0 || x%400==0)
            y = 366;
        else
            y = 365;

        System.out.println("количество дней в году: " + y);
    }
}