package com.ibs.javafeatures.interfaces;

public interface Greeter {
    //public
    default void sayHello(){
         sayGreet();
    }
    private void sayGreet(){
        System.out.println("Greet me Private");
    }
}
