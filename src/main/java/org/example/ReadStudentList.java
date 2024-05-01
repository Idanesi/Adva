package org.example;

import java.io.FileReader;
import java.io.IOException;

public class ReadStudentList {
    public static void readList() {
        try (FileReader reader = new FileReader("students.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}