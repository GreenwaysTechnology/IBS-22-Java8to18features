package com.ibs.javafeatures.varargs;

import java.util.ArrayList;
import java.util.List;

public class SafeVarArgsDemo {
    public static void main(String[] args) {
        SafeVarArgsDemo p = new SafeVarArgsDemo();
        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablet");
        p.display(list);
    }

    // Applying @SaveVarargs annotation
    @SafeVarargs
    private void display(List<String>... products) { // Not using @SaveVarargs
        for (List<String> product : products) {
            System.out.println(product);
        }
    }
}