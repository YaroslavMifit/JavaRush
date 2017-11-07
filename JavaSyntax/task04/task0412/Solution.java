package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String number1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        int number = Integer.parseInt(number1); //преобразовываем строку в число.

        if (number > 0)
            System.out.println(number * 2);

        else if (number < 0 )
            System.out.println(number + 1);

        else System.out.println(0);

    }

}