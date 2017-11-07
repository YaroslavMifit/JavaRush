package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }
        int y = 0;
        while (y != 13){

            String s = list.get(4);
            list.remove(4);
            list.add(0, s);
            y++;
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
    }
}
