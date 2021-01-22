package com.company;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String str = "";
        while ((str == in.nextLine())!= null) {
            int a = Integer.parseInt(str);
            int birth = 0;
            int monthOne = 1;
            int montheTwo = 0;
            int sum = 0;
            for (int i = 1; i < a; i++){
                birth += montheTwo;
                montheTwo += monthOne;
                monthOne += birth;
                sum = birth + montheTwo + monthOne;
            }
            System.out.println(sum);
        }
    }
}
