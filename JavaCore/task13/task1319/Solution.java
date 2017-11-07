package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream(reader.readLine())));

        String next;
        do
        {
            next = reader.readLine();
            writer.write(next);

            if (!next.equals("exit"))
            {
                writer.newLine();
            }
            else break;
        }
        while (!next.equals("exit"));
        System.out.println();
        reader.close();
        writer.close();
    }
}
