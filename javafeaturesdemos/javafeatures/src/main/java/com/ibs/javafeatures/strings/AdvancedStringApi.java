package com.ibs.javafeatures.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AdvancedStringApi {
    public static void main(String[] args) {
        String str = "*****\n  Hi\n  \tHello Pankaj\rHow are you?\n*****";

        System.out.println(str.indent(0));
        System.out.println(str.indent(3));
        System.out.println(str.indent(-3));

        String s = "Hi,Hello,Howdy";
        List strList = s.transform(s1 -> {return Arrays.asList(s1.split(","));});
        System.out.println(strList.stream());

        String so = "Hello";
        Optional os = so.describeConstable();
        System.out.println(os);
        System.out.println(os.get());

    }
}
