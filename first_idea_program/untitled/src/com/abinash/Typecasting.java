package com.abinash;

import java.util.Scanner;
public class Typecasting {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//        typecasting
        int num = (int)(67.56f);
        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257%256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c; //2000 exceeds byte limit so it does the multiplication in int
//
//        System.out.println(d);
//
        int number = 'A';
        System.out.println(number);
    }
}
