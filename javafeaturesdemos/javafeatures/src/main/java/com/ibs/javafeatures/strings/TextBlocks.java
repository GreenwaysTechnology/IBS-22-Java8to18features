package com.ibs.javafeatures.strings;

public class TextBlocks {
    public static void main(String[] args) {
        String textBlock = """
                Hi
                Hello
                Yes""";

        String str = "Hi\nHello\nYes";

        System.out.println("Text Block String:\n" + textBlock);
        System.out.println("Normal String Literal:\n" + str);

        String output = """
			    Name: %s
			    Phone: %d
			    Salary: $%.2f
			    """.formatted("Pankaj", 123456789, 2000.5555);

        System.out.println(output);

    }
}
