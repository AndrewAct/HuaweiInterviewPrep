package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String str;
        int num = 0;
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        str = Integer.toBinaryString(i);

        for (int j = 0; j < str.length(); j++){
            if (str.substring(j, j+1).equals("1")){
                num += 1;
            }
        }
        System.out.println(num);
    }
}