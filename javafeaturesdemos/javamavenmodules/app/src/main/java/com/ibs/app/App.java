package com.ibs.app;

import com.mycom.greeter.Greeter;

public class App {
    public static void main(String[] args) {
        System.out.println("Main App");
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
