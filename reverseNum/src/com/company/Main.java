package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String str = Integer.toString(a);
        StringBuilder strTwo = new StringBuilder("");
        for (int i = 0; i < str.length(); i++){
            strTwo.append(str.substring(str.length()-i-1, str.length()-i));
        }
        System.out.println(strTwo);
    }
}