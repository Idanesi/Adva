package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDem {
    public static void writeFile() {
        // Accept a string
        String str = "FileWriter is a class in Java used for writing character-based data to a file.";

        // attach a file to FileWriter
        try (FileWriter fw = new FileWriter("output.txt")) {
            // read character wise from string and write into FileWriter
            fw.write(str);

            // message when writing successful
            System.out.println("Writing successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
