// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package com.abinash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
//       taking input from keyboard
       System.out.print("Please enter some input: ");
       int rollno = input.nextInt();
       System.out.println("Your roll no is " + rollno);
    }
}