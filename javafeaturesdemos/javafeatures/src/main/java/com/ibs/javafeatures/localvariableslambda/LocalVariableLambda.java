package com.ibs.javafeatures.localvariableslambda;

@FunctionalInterface
interface Welcome {
    void sayHello(String message, String name);
}

public class LocalVariableLambda {
    public static void main(String[] args) {
        Welcome welcome = null;
        welcome = new Welcome() {
            @Override
            public void sayHello(String message, String name) {
                System.out.println(message + name);
            }
        };
        welcome.sayHello("Hello", "Subramanian");

        welcome = (String message, String name) -> System.out.println(message + name);

        welcome.sayHello("Hello", "Subramanian");

        welcome = (var message, var name) -> System.out.println(message + name);

        welcome.sayHello("Hello", "Subramanian");
    }
}
