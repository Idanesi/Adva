package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteStudentList {
    public static void writeList() {
        List<String> students = Arrays.asList("Alice", "Bob", "Charlie");

        try (FileWriter writer = new FileWriter("students.txt")) {
            for (String student : students) {
                writer.write(student + "\n");
//                BufferedWriter bw = new BufferedWriter(writer);
//                bw.write(student + "\n");
//                bw.flush();
            }
            System.out.println("Student list written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeMoreList() {
        List<String> students = Arrays.asList("Alex", "Dan", "Creed");

        try (FileWriter writer = new FileWriter("students.txt", true)) {
            for (String student : students) {
                writer.write(student + "\n");
                //Use BufferedWriter or BufferedReader
                // for efficient reading and writing operations
                //For example:
                //FileWriter writers = new FileWriter("write.txt");
                // BufferedWriter bw = new BufferedWriter(writers);
                // bw.write(student + "\n");
                // bw.flush();
            }
            System.out.println("More Student list written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
