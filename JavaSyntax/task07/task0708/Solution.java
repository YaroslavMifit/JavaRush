package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(5);
        list.add(bufferedReader.readLine());
        list.add(bufferedReader.readLine());
        list.add(bufferedReader.readLine());
        list.add(bufferedReader.readLine());
        list.add(bufferedReader.readLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(0).length() < list.get(i).length()) {
                list.set(0, list.get(i));
                list.set(i, list.get(1));

            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(0).length() == list.get(i).length()) {
                System.out.println(list.get(i));
            }

        }
    }
}
