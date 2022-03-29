package com.ibs.javafeatures.switchexpressions;

public class SwitchDemos {
    public static void main(String[] args) {
        int x = 1;
        //switch expression
        String res = switch (x) {
            case 1 -> "one";
            default -> "foo";
        };
        System.out.println(res);
        var myresponse = switch (x) {
            case 1 -> 23;
            default -> "foo";
        };
        System.out.println(myresponse);
        var numbers = 9;
        var choice = switch (numbers) {
            case 3, 6, 9 -> "Magic Number";
            default -> "Sorry you are unlucky";
        };
        System.out.println(choice);
        //traditional colon syntax;
        switch (numbers) {
            case 3, 6, 9:
                System.out.println("Magic Numbers");
                break;
            default:
                System.out.println("No Choice");
                break;
        }

        var y = switch (numbers) {
            case 1:
                String name = "foo";
                yield  name;
            default:
                String bar ="bar";
                yield bar;

        };
    }
}
