package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(r.readLine());
        double x = a % 5;
        if ( x < 3 )
            System.out.println( "зелёный" );
        else if
                ( x < 4 ) System.out.println( "желтый" );
        else System.out.println( "красный" );




    }
}