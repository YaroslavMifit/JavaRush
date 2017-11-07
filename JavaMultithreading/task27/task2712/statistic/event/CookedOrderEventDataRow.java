package com.javarush.task.task27.task2712.statistic.event;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.util.Date;
import java.util.List;

/**
 * Created by ЯРОСЛАВ on 03.09.2017.
 */
public class CookedOrderEventDataRow implements EventDataRow {

    private String tabletName;
    private String cookName;
    private int cookingTimeSeconds;
    private List<Dish> cookingDishs;
    private Date currentDate;

    public CookedOrderEventDataRow(String tabletName, String cookName, int cookingTimeSeconds, List<Dish> cookingDishs) {
        this.tabletName = tabletName;
        this.cookName = cookName;
        this.cookingTimeSeconds = cookingTimeSeconds;
        this.cookingDishs = cookingDishs;
        this.currentDate = new Date();
    }

    public String getTabletName() {
        return tabletName;
    }

    public String getCookName() {
        return cookName;
    }

    public int getCookingTimeSeconds() {
        return cookingTimeSeconds;
    }

    public List<Dish> getCookingDishs() {
        return cookingDishs;
    }

    @Override
    public EventType getType() {
        return EventType.COOKED_ORDER;
    }
}
