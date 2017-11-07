package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        while(fileInputStream.available() > 0){
            byte[] data = new byte[fileInputStream.available()];
            fileInputStream.read(data);
            fileOutputStream.write(getInput(data));
        }


        fileInputStream.close();
        fileOutputStream.close();

    }

    private static byte[] getInput(byte[] data){

        StringBuilder builder = new StringBuilder();
        String[] s = new String(data).split(" ");

        long[] tmp = new long[s.length];

        for(int i = 0; i < s.length; i++){
            tmp[i] = Math.round(Double.valueOf(s[i]));
        }

        for(long i : tmp){
            builder.append(i);
            builder.append(" ");
        }

        byte[] res = builder.toString().getBytes();

        return res;
    }
}
