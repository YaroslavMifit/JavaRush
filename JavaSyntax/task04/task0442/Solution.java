package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int sum=0;
        int a=0;
        while(a!=-1)
        {
            a = in.nextInt();
            sum=sum+a;
        }
        System.out.println(sum);
    }
}
