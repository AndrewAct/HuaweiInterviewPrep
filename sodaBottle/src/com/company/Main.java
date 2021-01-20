package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int count, temp, remainder;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int i = in.nextInt();
            count = 0;
            if (i == 0){
                break;
            }
            if ( i > 0 && i <= 1000){
                while ( i >= 2) {
                    if (i == 2) {
                        count += 1;
                        //System.out.println(count);
                        i = 0;
                        continue;
                    }
                    temp = i / 3;
                    count += temp;
                    remainder = i % 3;
                    i = temp + remainder;

                }
            }
            System.out.println(count);
            //i = in.nextInt();
        }
    }
}