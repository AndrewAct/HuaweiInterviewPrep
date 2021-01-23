package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            System.out.println(fibbo(a));
        }
    }

    public static int fibbo(int mon){
        if (mon == 1 || mon == 2) return 1;
        return fibbo(mon- 1)+ fibbo(mon - 2);
    }
}
