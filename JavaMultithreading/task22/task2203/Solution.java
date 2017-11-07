package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException{

        if (string == null || string.isEmpty())
            throw new TooShortStringException();
        int firstSpaceIndex = string.indexOf('\t') + 1;
        char[] chars = string.toCharArray();
        int countSpace = 0;
        int lastSpaceIndex = 0; //
        for (int i = 0; i < string.length(); i++)
        {
            if (chars[i] == '\t')
            {
                countSpace++;
                if (countSpace == 1)
                {
                    lastSpaceIndex = string.length();
                } else if (countSpace == 2)
                {
                    lastSpaceIndex = i;
                    break;
                }
            }
        }
        if (countSpace <= 1)
        {
            throw new TooShortStringException();
        }
        return string.substring(firstSpaceIndex, lastSpaceIndex);

    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
