package com.javarush.task.task34.task3411;

import java.util.Stack;
/* 
Ханойские башни
*/

public class Solution {
    public static Stack<Integer> first     = new Stack<>();
    public static Stack<Integer> second    = new Stack<>();
    public static Stack<Integer> third     = new Stack<>();

    public static void main(String[] args) {
        int count = 3;
        moveRing('A', 'B', 'C', count);
    }

    public static void moveRing(char a, char b, char c, int count) {



        if (first.isEmpty() && second.isEmpty() && third.isEmpty()) {
            for (int i = count; i > 0; i--){
                first.push(i);
            }
            moveRing(a, c, b, count);
            return;
        }
        Stack<Integer> from  = new Stack<>();
        Stack<Integer> help  = new Stack<>();
        Stack<Integer> to    = new Stack<>();
        if      (a == 'A') from = first;
        else if (a == 'C') from = third;
        else if (a == 'B') from = second;
        if      (b == 'B') help = second;
        else if (b == 'A') help = first;
        else if (b == 'C') help = third;
        if      (c == 'C') to = third;
        else if (c == 'B') to = second;
        else if (c == 'A') to = first;
        try {
            if (count > 0){
                moveRing(a,c,b,count-1); // перенести башню из n−1 диска на 2-й штырь
                int biggest = from.pop();
                to.push(biggest); // переносим самый большой диск на 3-й штырь
                if (a == 'A')      first    = from;
                else if (a == 'C') third    = from;
                else if (a == 'B') second   = from;
                if      (b == 'B') second   = help;
                else if (b == 'A') first    = help;
                else if (b == 'C') third    = help;
                if      (c == 'C') third    = to;
                else if (c == 'B') second   = to;
                else if (c == 'A') first    = to;
                System.out.println("from " + a + " to " + c);
                moveRing(b,a,c,count-1); // перенеси башню из n−1 диска на 3-й штырь
            }
        } catch (Exception e){}
    }
}