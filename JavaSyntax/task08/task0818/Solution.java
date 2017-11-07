package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10 ; i++) {
            map.put("q"+i, 498+ i);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        ArrayList<String> list = new ArrayList();
        for (HashMap.Entry pair : map.entrySet())
        {
            if ((int)pair.getValue()<500) list.add((String)pair.getKey());
        }
        for (String text : list)
        {
            map.remove(text);
        }
    }

    public static void main(String[] args) {

    }
}