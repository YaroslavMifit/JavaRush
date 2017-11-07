package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length ==0){
            throw new IllegalArgumentException();
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(bufferedReader.readLine());
        BufferedReader fileBufReader = new BufferedReader(fileReader);

        String res;

        while ((res = fileBufReader.readLine()) != null){
            if (res.startsWith(args[0] + " ")){
                System.out.println(res);
                break;
            }
        }

        bufferedReader.close();
        fileBufReader.close();
        fileBufReader.close();
    }
}
