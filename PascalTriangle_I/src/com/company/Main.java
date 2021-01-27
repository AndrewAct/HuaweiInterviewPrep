package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            if (num == 1 || num == 2){
                System.out.println(-1);
            }
            else if (num%2 == 1){
                System.out.println(2);
            }
            else if (num % 4 == 0){
                System.out.println(3);
            }
            else {
                System.out.println(4);
            }
        }
        in.close();
    }
}
