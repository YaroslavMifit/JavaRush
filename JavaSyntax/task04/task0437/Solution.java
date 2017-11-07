package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        for (int n = 1; n <= 10; n++) {
            for(int i = 1; i<=n; i++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
