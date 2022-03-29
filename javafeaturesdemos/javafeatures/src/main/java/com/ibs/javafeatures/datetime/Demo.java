package com.ibs.javafeatures.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo {

    public static void main(String[] args) {
        LocalTime date = LocalTime.parse("15:25:08.690791");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
        System.out.println(date.format(formatter));
    }

}
