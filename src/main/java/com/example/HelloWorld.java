package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); //comment 1
        System.out.println(getNew());
    }

    public String getGreeting() {
        return "Hello, World!";
    }

    public String getNew(){
        return "Automation is Wow";
    }
}
