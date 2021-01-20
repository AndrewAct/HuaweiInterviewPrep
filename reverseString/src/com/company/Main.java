package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        StringBuilder strTwo = new StringBuilder("");
        for (int i = 0; i < len; i++){
            strTwo.append(str.substring(len -i-1, len - i));
        }
        System.out.println(strTwo);
    }
}