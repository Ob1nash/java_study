package com.Abinash;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res= 0;
        while (n>0){
            int rem =  n%10;
            n = n/10;
            res =  res*10 + rem;
        }

        System.out.println(res);
    }


}
