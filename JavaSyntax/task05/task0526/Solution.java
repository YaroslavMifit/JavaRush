package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Petya", 1, "kim 11");
        Man man2 = new Man("Vasya", 13, "kim 14");
        Woman woman1 = new Woman("Tanya", 13, "kim 14");
        Woman woman2 = new Woman("Masha", 14, "kim 11");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man{
        String name, address;
         int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;

        }
        public String toString() {
            return (name + " " + age + " " + address);
        }

    }
    public static class Woman{
        String name, address;
        int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;

        }
        public String toString() {
            return (name + " " + age + " " + address);
        }

    }
}
