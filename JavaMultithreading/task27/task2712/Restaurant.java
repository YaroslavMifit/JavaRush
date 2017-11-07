package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

/**
 * Created by ЯРОСЛАВ on 29.08.2017.
 */
public class Restaurant {

    public static void main(String[] args) throws Exception {
        Waiter waiter = new Waiter();
        Cook cook = new Cook("Amigo");
        cook.addObserver(waiter);
        Tablet tablet = new Tablet(5);
        tablet.addObserver(cook);
        tablet.createOrder();
    }
}
