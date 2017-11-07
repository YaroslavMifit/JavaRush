package com.javarush.task.task23.task2311.Kill;

/**
 * Created by ЯРОСЛАВ on 01.08.2017.
 */
public class Stand extends BaseObject {
    private double speed, direction;

    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {
        x += speed*direction;
    }

    public Stand(double x, double y, double radius) {
        super(x, y, radius);
    }

    public void moveLeft(){
        direction = -1;
    }

    public void moveRight(){
        direction = 1;
    }
}
