package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private String familyName;
        private int age;
        private boolean sex;
        private boolean children;


        public Human(String firstName, String lastName, String familyName, int age, boolean sex, boolean children) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.familyName = familyName;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }
        public Human(String firstName, String lastName, String familyName, int age, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.familyName = familyName;
            this.age = age;
            this.sex = sex;
        }
        public Human(String firstName, String lastName, String familyName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.familyName = familyName;
            this.age = age;
        }
        public Human(String firstName, String lastName, String familyName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.familyName = familyName;
        }
        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Human(String firstName) {
            this.firstName = firstName;
        }
        public Human(String lastName, String familyName, int age, boolean sex, boolean children) {
            this.lastName = lastName;
            this.familyName = familyName;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }
        public Human(String familyName, int age, boolean sex, boolean children) {
            this.familyName = familyName;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }
        public Human(int age, boolean sex, boolean children) {
            this.age = age;
            this.sex = sex;
            this.children = children;
        }
        public Human(boolean sex, boolean children) {
            this.sex = sex;
            this.children = children;
        }

    }
}
