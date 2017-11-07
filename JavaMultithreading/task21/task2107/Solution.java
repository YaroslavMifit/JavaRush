package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable{
    @Override
    protected Solution clone() throws CloneNotSupportedException {
        for(Map.Entry<String,User> i : this.users.entrySet()){
            User us = (User) i.getValue().clone();
            users.put(i.getKey(),us);
        }
        Solution sol1 = new Solution();
        sol1.users.putAll(users);
        return sol1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable{
        int age;
        String name;

        @Override
        protected User clone() throws CloneNotSupportedException {
            return (User) new User(this.age,this.name);
        }

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
