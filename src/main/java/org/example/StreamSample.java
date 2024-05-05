package org.example;

import java.io.*;

public class StreamSample {

    private static final String inputFilePath = "input.txt";
    private static final String outputFilePath = "output.txt";

    public static void bStream() {
        // Example using Byte Streams
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                // Process the binary data
                // Example: Encrypt the data
                byte[] encryptedData = encryptData(buffer, bytesRead);

                // Write the encrypted data to the output file
                fos.write(encryptedData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static void cStream() {
        // Example using Character Streams
        try (FileReader fr = new FileReader(inputFilePath);
             FileWriter fw = new FileWriter(outputFilePath)) {

            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);

            String line;
            while ((line = br.readLine()) != null) {
                // Process the text data
                // Example: Convert the text to uppercase
                String processedLine = line.toUpperCase();

                // Write the processed line to the output file
                bw.write(processedLine);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] encryptData(byte[] data, int length) {
        // Example encryption logic
        // This is just a placeholder and does not represent a secure encryption algorithm
        byte[] encryptedData = new byte[length];
        for (int i = 0; i < length; i++) {
            encryptedData[i] = (byte) (data[i] + 1);
        }
        return encryptedData;
    }
}
