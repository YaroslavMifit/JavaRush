package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ЯРОСЛАВ on 23.07.2017.
 */
public class Hippodrome {

    public static void main(String[] args) {
        Horse horse1 = new Horse("Mitya", 3, 0);
        Horse horse2 = new Horse("Petya", 3, 0);
        Horse horse3 = new Horse("Mark", 3, 0);

        game = new Hippodrome();

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game.run();
        game.printWinner();
    }

    public Horse getWinner(){

        Horse winner = null;

        for (Horse h :getHorses()){
            if(winner == null){
                winner = h;
            }
            else if (winner.getDistance() < h.getDistance()){
                winner = h;
            }
        }
            return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName()+"!");
    }

    public void run(){
        try {
            for (int i = 0; i < 100 ; i++) {
                move();
                print();
                Thread.sleep(200);
            }
            } catch (InterruptedException e) {

            }
        }

    public void move(){
    for (Horse horse : horses){
        horse.move();
    }
    }

    public void print(){
        for (Horse horse : horses){
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public static Hippodrome game;

    public Hippodrome() {

    }

    private static List<Horse> horses = new ArrayList<>();

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }


}
