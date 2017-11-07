package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=0;a>0;i++){
            if(a%2==0){
                even++;
            }else{
                odd++;
            }
            a/=10;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
