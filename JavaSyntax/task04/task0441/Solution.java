package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a<=c && c<=b || a>=c && c>=b)
            System.out.println(c);
        else if (c<a && a<b || c>a && a>=b)
            System.out.println(a);
        else System.out.println(b);
    }
}
