package com.Abinash;

public class Greetings {
    public static void main(String[] args) {
//        Greetings();
//    }
//    static void Greetings(){
//        System.out.println("Hello World!");
//    }
        String personalised = myGreet("Abinash Kalita");
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String message="Hello " + name;
        return message;
    }
}
