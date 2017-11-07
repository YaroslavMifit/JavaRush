package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(bufferedReader.readLine());
        int zpt = 0;
        while (inputStream.available()>0)
        {
            if (inputStream.read()== 44){
                zpt++;
            }
        }
        System.out.println(zpt);
        inputStream.close();
        bufferedReader.close();
    }
}
