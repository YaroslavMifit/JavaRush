package com.javarush.task.task13.task1305;

/* 
Четыре ошибки
*/

public class Solution {


    public static void main(String[] args) throws Exception {

        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

    interface Desire {
    }

    interface Dream {
        Hobbie HOBBIE = new Hobbie();
    }

   public static class Hobbie implements Dream, Desire {
         int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
