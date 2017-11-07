package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ЯРОСЛАВ on 29.08.2017.
 */
public class ConsoleHelper {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

     public static void writeMessage(String message){
         System.out.println(message);
    }

     public static String readString()throws Exception{
         String massage = bufferedReader.readLine();

         return massage;
     }

     public static List<Dish> getAllDishesForOrder() throws Exception{
         List<Dish> listDish = new ArrayList<>();
         String str = "";
         writeMessage("Выберите блюдо:\n" + Dish.allDishesToString());

         while (true) {

             str = readString();
             if (str.equalsIgnoreCase("exit")) {
                 break;
             }

             else {
                 try {
                     listDish.add(Dish.valueOf(str));
                 }

                 catch (IllegalArgumentException e) {
                     writeMessage(str + " is not detected");
                 }
             }
         }

         return listDish;
    }

}
