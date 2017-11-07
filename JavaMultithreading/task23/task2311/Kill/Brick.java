package com.javarush.task.task23.task2311.Kill;

/**
 * Created by ЯРОСЛАВ on 01.08.2017.
 */
public class Brick extends BaseObject {

    public Brick(double x, double y) {
        super(x, y, 3);
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {

    }

    public Brick(double x, double y, double radius) {
        super(x, y, radius);
    }
}
