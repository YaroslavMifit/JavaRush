package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        //Вводим данные
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date(reader.readLine());

        //Форматируем данные. Подсказка есть тут
        // http://www.seostella.com/ru/article/2012/02/05/formatirovanie-daty-v-java.html
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, y");

        //Выводим на экран, не забыв все буквы сделать большими
        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }
}
