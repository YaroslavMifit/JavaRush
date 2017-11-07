package com.javarush.task.task25.task2502;

import java.io.IOException;
import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution{
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car{
        protected List<Wheel> wheels;

        public Car() throws IOException {
            wheels = new ArrayList<>();
            int wheelCount = 0;
            for(String currentWheel : loadWheelNamesFromDB()){
                wheels.add(Wheel.valueOf(currentWheel));
                wheelCount += 1;
            }
            if (wheelCount != 4)
                throw new IOException();
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
