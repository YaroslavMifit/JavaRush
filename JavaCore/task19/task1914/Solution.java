package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        testString.printSomething();
        String result = byteArrayOutputStream.toString();

        System.setOut(console);
        String[] arr = result.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        int c = 0;
        if (arr[1].equals("+"))
        {
            c = a + b;
        } else if (arr[1].equals("-"))
        {
            c = a - b;
        } else if (arr[1].equals("*"))
        {
            c = a * b;
        }
        System.out.println(a + " " + arr[1] + " " + b + " = " + c);
    }


    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

