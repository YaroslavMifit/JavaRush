package com.javarush.task.task21.task2103;

/* 
Все гениальное - просто!
*/
class Feline {
    public String type = "f ";
    public Feline() {
        System.out.print("feline ");
    }
}
class Cougar extends Feline {
    public Cougar() {
        System.out.print("cougar ");
    }
    public void go() {
        type = "c ";
        System.out.print(this.type + super.type);
    }
    public static void main(String[] args) {
        new Cougar().go();
    }
}