package com.javarush.task.task13.task1328;

/* 
Битва роботов
*/

public class Solution {
    public static void main(String[] args) {
        AbstractRobot amigo = new AbstractRobot("Амиго")
        {
            @Override
            public String getName()
            {
                return super.getName();
            }

            @Override
            public BodyPart attack()
            {
                return super.attack();
            }

            @Override
            public BodyPart defense()
            {
                return super.defense();
            }
        };

        AbstractRobot enemy = new AbstractRobot("Сгибальщик-02")
        {
            @Override
            public String getName()
            {
                return super.getName();
            }

            @Override
            public BodyPart attack()
            {
                return super.attack();
            }

            @Override
            public BodyPart defense()
            {
                return super.defense();
            }
        };

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }
}
