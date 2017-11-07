package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.util.List;

/**
 * Created by ЯРОСЛАВ on 29.08.2017.
 */
public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws Exception{
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    @Override
    public String toString() {
        if (dishes.isEmpty()) {
            return "";
        }
        else {
            return "Your order: " + dishes.toString() +" of "+  tablet.toString();
        }
    }

    public int getTotalCookingTime(){
        int totalTime = 0;
        for (Dish dish : dishes){
            totalTime += dish.getDuration();
        }
        return totalTime;

    }

    public boolean isEmpty() {
        return dishes.isEmpty();
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
