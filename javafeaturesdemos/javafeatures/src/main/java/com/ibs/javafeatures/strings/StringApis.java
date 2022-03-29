package com.ibs.javafeatures.strings;

import java.util.stream.Collectors;

public class StringApis {
    public static void main(String[] args) {
        System.out.println(" ".isBlank() ? "Blank" : "Not Blank"); //true
        String str = "JD\nJD\nJD";
        str.lines().map(String::toLowerCase).collect(Collectors.toList()).forEach(System.out::println);
         str = " JD ";
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");
        String hello = "hello".repeat(10);
        System.out.println(hello);
    }
}
