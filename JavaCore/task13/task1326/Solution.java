package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        InputStream inStream = new FileInputStream(reader.readLine());
        Scanner scanner = new Scanner(inStream);

        while (scanner.hasNextInt())
        {
            int data = scanner.nextInt();
            if(data %2 == 0) list.add(data);
        }
        Collections.sort(list);
        for (int i : list)
        {
            System.out.println(i);
        }

        inStream.close(); //закрываем потоки
    }
}
