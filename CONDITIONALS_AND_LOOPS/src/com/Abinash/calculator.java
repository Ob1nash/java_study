package com.Abinash;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float ans = 0;

        while(true){
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter Two Numbers: ");
                float num1 = in.nextFloat();
                float num2 = in.nextFloat();


                if(op == '+'){
                    ans = num1 + num2;
                }

                if(op == '-'){
                    ans = num1 - num2;
                }

                if(op == '*'){
                    ans = num1 * num2;
                }

                if(op == '/'){
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                }

                if(op == '%'){
                    ans = num1 % num2;
                }


            } else if (op == 'x' || op == 'X') {
                break;

            }else{
                System.out.println("invalid operation");
            }
            System.out.println(ans);

        }


    }
}
