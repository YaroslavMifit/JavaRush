package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap map = new HashMap();
        for(int i = 0; i < 5; i++)
            map.put("Stallone"+i, new Date("JUNE 1 198"+i));
        for(int i = 0; i < 5; i++)
            map.put("Stallone"+(i+5), new Date("MAY 1 198"+i));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            HashMap.Entry pair = (HashMap.Entry) it.next();
            Date d = (Date) pair.getValue();
            if ((d.getMonth() > 4)&&(d.getMonth() < 8))
                it.remove();
        }
    }

    public static void main(String[] args) {

    }
}
