package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String strE = null;
        while (in.hasNext()){
            strE = in.next();
            strE = strE.replaceAll("[\\[{]", "(");
            strE = strE.replaceAll("[]}]", ")");
            StringBuilder strB = new StringBuilder();
            for (int i = 0; i < strE.length(); i++){
                char var = strE.charAt(i);
                if (i == 0 && var == '='){
                    strB.append('0');
                    strB.append(var);
                }
                else if (var == '-' && strE.charAt(i-1) == '('){
                    strB.append("(0");
                    strB.append(var);
                }
            }
        }
    }
}
