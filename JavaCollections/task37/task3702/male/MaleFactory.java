package com.javarush.task.task37.task3702.male;

import com.javarush.task.task37.task3702.AbstractFactory;
import com.javarush.task.task37.task3702.Human;

/**
 * Created by ЯРОСЛАВ on 26.09.2017.
 */
public class MaleFactory implements AbstractFactory{
    public Human getPerson(int age){
        if (age > 19)
            return new Man();
        else if (age > 12 && age < 20)
            return new TeenBoy();

        return new KidBoy();
    }
}
