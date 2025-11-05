//Cannon Rivera, 11/5/2025, RandomDataFile
//The purpose of this program is to write 10 random numbers to a file
//And then to display all the numbers

package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomDataFile {
    public static void main(String[] args) {
        File file = new File("file.txt");
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

        System.out.println("Contents of the file.txt is:");
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
