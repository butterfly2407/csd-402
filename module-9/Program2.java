// Katie Hilliard, 02/12/2024 Module 9 Assignment

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        String fileName = "data.file";
        Random random = new Random();

        try {
            // Create new data.file
            File file = new File(fileName);
            boolean isNewFile = file.createNewFile(); // Check to see if file already exists

            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            System.out.println(isNewFile ? "New file created." : "Appending to existing file.");
            System.out.print("Writing numbers: ");

            for (int i = 0; i < 10; i++) {
                int randomNum = random.nextInt(100); // Generate random number (0-99)
                bufferedWriter.write(randomNum + " ");
                System.out.print(randomNum + " "); // Print numbers
            }

            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("\nData written successfully.");

            // Read and display file contents
            System.out.println("\nReading file contents:");
            Scanner fileReader = new Scanner(new File(fileName));

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

            fileReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
