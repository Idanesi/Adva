package org.example;

import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SpecifiedCharsetDemo {
    public static void specify() {
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("example.txt"), StandardCharsets.UTF_8)) {
            writer.write("Text with UTF-8 encoding");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
