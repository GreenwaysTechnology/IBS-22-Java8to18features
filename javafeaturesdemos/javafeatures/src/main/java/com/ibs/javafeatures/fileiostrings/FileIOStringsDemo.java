package com.ibs.javafeatures.fileiostrings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIOStringsDemo {
    public static void main(String[] args) {
        Path path = null;
        try {
            path = Files.writeString(Files.createTempFile("test", ".txt"), "Hello How are you");
            System.out.println(path);
            String s = Files.readString(path);
            System.out.println(s); //This was posted on JD

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
