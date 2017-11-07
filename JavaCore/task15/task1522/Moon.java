package com.javarush.task.task15.task1522;

/**
 * Created by ЯРОСЛАВ on 04.07.2017.
 */
public class Moon implements Planet{
    private Moon() {
    }

    public static Moon getInstance() {
        if(instance == null){
            instance = new Moon();
        }
        return instance;
    }

    private static Moon instance;
}
