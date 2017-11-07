package com.javarush.task.task08.task0817;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i <10 ; i++) {
            map.put("q" + i, "r" + i);
        }
    return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> entry : copy.entrySet()) {
            for (Map.Entry<String, String> maps : map.entrySet()) {
                if (entry.getValue().equals(maps.getValue()) && !entry.getKey().equals(maps.getKey())) {
                    removeItemFromMapByValue(map, entry.getValue());
                    break;

                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
