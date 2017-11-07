package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);

        byte [] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);

        byte [] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);

        fileOutputStream1.write(buffer2);
        fileOutputStream1.write(buffer1);

        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream1.close();

    }
}
