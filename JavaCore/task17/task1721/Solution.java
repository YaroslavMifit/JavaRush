package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();

        try {
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));
            while (bufferedReader1.ready()){
                allLines.add(bufferedReader1.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName2)));
            while (bufferedReader2.ready()){
                forRemoveLines.add(bufferedReader2.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
            return;
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
