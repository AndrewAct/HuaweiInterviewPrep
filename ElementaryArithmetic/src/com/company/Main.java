package com.company;

import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        String strExpression = null;
        while (scanner.hasNext()){
            strExpression = scanner.nextLine();

            strExpression = strExpression.replaceAll("[\\[{]","(");
            strExpression = strExpression.replaceAll("[]}]",")");
            StringBuilder str = new StringBuilder();

            for(int i = 0;i < strExpression.length();i++){
                char var = strExpression.charAt(i);
                if(i == 0 && var == '-'){
                    str.append('0');
                    str.append(var);
                }
                else if(var == '-' && strExpression.charAt(i-1) == '(') {
                    str.append("(0");
                    str.append(var);
                    i++;
                    while (strExpression.charAt(i) >= '0' && strExpression.charAt(i) <= '9')
                        str.append(strExpression.charAt(i++));
                    str.append(')');
                    str.append(strExpression.charAt(i));
                }
                else
                    str.append(var);
            }
            System.out.println(calculate(isPushStack(str.toString())));
        }
    }

    public static int calculate(String strExpression){
        Stack<Integer> stack = new Stack<>();


        for(int i = 0;i < strExpression.length();i++){
            char var = strExpression.charAt(i);
            if(var == '(') {
                StringBuilder num = new StringBuilder();
                i++;
                while(strExpression.charAt(i) != ')'){
                    num.append(strExpression.charAt(i));
                    i++;
                }
                stack.push(Integer.parseInt(num.toString()));
            }
            else{
                int count = 0;
                int var2 = stack.pop();
                int var1 = stack.pop();
                if(var == '+'){
                    count = var1 + var2;
                }
                else if(var == '-'){
                    count = var1 - var2;
                }
                else if(var == '*')
                    count = var1 * var2;
                else if(var == '/')
                    count = var1 / var2;
                stack.push(count);
            }
        }
        return stack.pop();
    }

    private static String isPushStack(String strExpression){
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i < strExpression.length();i++){
            char var = strExpression.charAt(i);

            if(var >= '0' && var <= '9') {
                sb.append('(');
                while ( strExpression.charAt(i) >= '0' && strExpression.charAt(i) <= '9') {
                    sb.append(strExpression.charAt(i));
                    if( i < strExpression.length() - 1)
                        i++;
                    else
                        break;
                }
                sb.append(')');
                var = strExpression.charAt(i);
            }

            if((stack.isEmpty() && (var < '0' || var > '9')) || var == '(' || stack.peek() == '(' || stack.peek() == ')')    
                stack.push(var);
            else if(var == ')' ){
                while (stack.peek() != '(')
                    sb.append(stack.pop());
                stack.pop();
            }
            else if(!stack.isEmpty() && (var == '+' || var == '-' || var == '*' || var == '/')){
                while (!stack.isEmpty() && isFrist(stack.peek(),var))
                    sb.append(stack.pop());
                stack.push(var);
            }
        }

        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.toString();
    }

    private static boolean isFrist(char var1,char var2){
        if(var1 == '*' || var1 == '/'){
            return true;
        }
        else if(var1 == '+' || var1 == '-'){
            if(var2 == '*' || var2 == '/')
                return false;
            else
                return true;
        }
        else
            return false;
    }
}
