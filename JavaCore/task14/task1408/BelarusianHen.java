package com.javarush.task.task14.task1408;

/**
 * Created by ЯРОСЛАВ on 28.06.2017.
 */
public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - "+ Country.BELARUS+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
