package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader in = new BufferedReader(new FileReader(file1));
        BufferedWriter out = new BufferedWriter(new FileWriter(file2));

        while (in.ready()) {
            char c = (char) in.read();
            if (!Pattern.matches("\\p{P}",String.valueOf(c))) {
                out.write(c);
            }
        }
        in.close();
        out.close();
    }
}