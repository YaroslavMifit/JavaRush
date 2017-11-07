package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0 && a< 1000){
        if (a % 2 == 0) {
            System.out.print("четное ");
            if (a < 10)
                System.out.print("однозначное число");
            else if (a < 100)
                System.out.print("двузначное число");
            else if (a < 1000)
                System.out.print("трехзначное число");
        }
            else if (a % 2 > 0) {
            System.out.print("нечетное ");
            if (a < 10)
                System.out.print("однозначное число");
            else if (a < 100)
                System.out.print("двузначное число");
            else if (a < 1000)
                System.out.print("трехзначное число");
        }
    }
    }
}
