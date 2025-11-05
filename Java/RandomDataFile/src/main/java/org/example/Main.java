package org.example;
//Program 2: Write a program to create a new file titled data.file, if the file does not exist.
// Then write to the new file, adding 10 randomly generated numbers,
// or append 10 randomly generated numbers to a previous file. Each integer is to be separated by a space.
// Close the file, then reopen the file and read the data from the file and display it.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        try {
            boolean append = file.exists();
            FileWriter writer = new FileWriter(file, append);

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100);
                writer.write(number + " ");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Couldn't write to file: " + e.getMessage());
            return;
        }

        System.out.println("Contents of the data.file is:");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext()) {
                System.out.print(fileScanner.next() + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Couldn't read from file: " + e.getMessage());
        }
    }
}
