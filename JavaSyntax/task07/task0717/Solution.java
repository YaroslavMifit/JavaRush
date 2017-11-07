package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int k = 0; k < list.size() ; k++){
                k++;
            list.add(k, list.get(k-1));

        }
        return list;
    }
}
