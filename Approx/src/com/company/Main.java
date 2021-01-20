package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        float f;
        int i;
        f = in.nextFloat();
        i = Math.round(f);
        System.out.println(i);
    }
}
