package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file;
        while (true) {
            String fileName = rd.readLine();
            try {

                file = new FileInputStream(fileName);
                file.close();

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                rd.close();
                break;
            }
        }
    }
}
