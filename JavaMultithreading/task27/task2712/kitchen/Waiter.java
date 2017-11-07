package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ЯРОСЛАВ on 03.09.2017.
 */
public class Waiter implements Observer {
    @Override
    public void update(Observable o, Object arg) {

        if (arg instanceof Order && o instanceof Cook) {

            ConsoleHelper.writeMessage(arg + " was cooked by " + o);
        }
    }
}
