package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(10);
        int max=0;
        int min=0;
        for (int i=0;i<10;i++){
            list.add(reader.readLine());
        }

        for (int i=0;i<10;i++){
            if (list.get(i).length() < list.get(min).length()){
                min = i;
            }
           else if (list.get(i).length() > list.get(max).length()){
                max = i;
            }
        }

        System.out.println(list.get(Math.min(min,max)));

    }
}
