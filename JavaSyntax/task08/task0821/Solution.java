package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();

        map.put("i11", "m111");
        map.put("i1", "m11");
        map.put("i11", "m22");
        map.put("i11", "m12");
        map.put("i11", "m11");
        map.put("i111", "m111");
        map.put("i444", "m444");
        map.put("i551", "m155");
        map.put("i66", "m886");
        map.put("i771", "m881");


        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
