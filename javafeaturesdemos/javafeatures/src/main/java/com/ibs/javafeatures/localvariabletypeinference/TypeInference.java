package com.ibs.javafeatures.localvariabletypeinference;

import java.util.List;

public class TypeInference {

    public static void main(String[] args) {
        //local variable
        int a = 10;
        System.out.println(a);
        //type inference is nothing but , variable type is understood automatically
        var b = 100;
        System.out.println(b);
        var numbers = List.of(1, 2, 3);
        numbers.forEach(System.out::println);
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}
