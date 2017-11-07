package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        return a;

    }

    public static int readInt() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(bufferedReader.readLine());
        return b;
    }

    public static double readDouble() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double c = Double.parseDouble(bufferedReader.readLine());
        return c;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean d = Boolean.parseBoolean(bufferedReader.readLine());
        return  d;
    }



    public static void main(String[] args) {

    }
}

