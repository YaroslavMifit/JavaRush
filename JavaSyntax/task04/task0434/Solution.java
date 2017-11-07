package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;

        while (i < 10) {
            int k = 0;
            while (k < 10) {
                System.out.print(a[k]*a[i] + " ");
                k++;
            }
            System.out.println();
            i++;
        }

    }
}
