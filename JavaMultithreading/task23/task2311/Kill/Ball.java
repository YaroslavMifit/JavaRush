package com.javarush.task.task23.task2311.Kill;

/**
 * Created by ЯРОСЛАВ on 01.08.2017.
 */
public class Ball extends BaseObject {
    private double speed, direction, dx, dy;
    private boolean isFrozen;

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;
        this.isFrozen = true;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'O');
    }

    @Override
    public void move() {
        if (isFrozen) return;

        x += dx;
        y += dy;
    }

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    public void start(){
        this.isFrozen = false;
    }

    public void checkRebound(int minx, int maxx, int miny, int maxy){

    }

    public void setDirection(double angle){
        this.direction = direction;
        double angel = Math.toRadians(direction);
        dx = Math.cos(angle) * speed;
        dy = -Math.sin(angle) * speed;
    }
}
