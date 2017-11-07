package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outPut);
        System.setOut(stream);

        testString.printSomething();
        String result = outPut.toString();

        System.setOut(console);
        StringBuilder str = new StringBuilder(result.toUpperCase());
        String str1 = str.toString();
        System.out.println(str1);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
