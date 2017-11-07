package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==0)
            System.out.print("ноль");

        else if (a>0){
            System.out.print("положительное ");
            if(a%2==0)
                System.out.print("четное число");
            else
                System.out.print("нечетное число");
        }

        else if (a<0){
            System.out.print("отрицательное ");
            if(a%2==0)
                System.out.print("четное число");
            else
                System.out.print("нечетное число");
        }
    }
}
