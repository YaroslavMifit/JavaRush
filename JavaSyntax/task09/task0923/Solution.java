package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        for (int i = 0; i < s.length(); i++) {

            if(isVowel(s.charAt(i))){
                System.out.print(s.charAt(i) + " ");
            }

            if(i == s.length()-1){
                System.out.print("\n");
            }
        }


        for (int i = 0; i < s.length(); i++) {

            if(!isVowel(s.charAt(i)) &&  s.charAt(i) !=  ' '){
                System.out.print(s.charAt(i) + " ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}