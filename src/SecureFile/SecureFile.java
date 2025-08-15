// File: SecureFile/SecureFile.java
package SecureFile;

import java.io.IOException;
import java.util.Scanner;

/**
 * The main class and entry point for the SecureFile application.
 * It handles user interaction and coordinates the file management and crypto logic.
 */
public class SecureFile {

    public static void main(String[] args) {
        // Create instances (objects) of our other classes to use their methods.
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();
        CryptoLogic cryptoLogic = new CryptoLogic();

        System.out.println("--- Welcome to SecureFile ---");

        // An infinite loop to keep the menu running until the user decides to exit.
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Encrypt a file");
            System.out.println("2. Decrypt a file");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine();

            // Check if the user wants to exit.
            if ("3".equals(choice)) {
                System.out.println("Exiting. Stay secure!");
                break; // 'break' exits the while loop.
            }

            // Validate user input. If it's not 1 or 2, restart the loop.
            if (!"1".equals(choice) && !"2".equals(choice)) {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue; // 'continue' skips the rest of the loop and starts from the top.
            }

            // Get necessary information from the user.
            System.out.print("Enter the path of the source file: ");
            String sourcePath = scanner.nextLine();
            System.out.print("Enter the path for the destination file: ");
            String destPath = scanner.nextLine();
            System.out.print("Enter your secret key: ");
            String key = scanner.nextLine();

            // The 'try-catch' block handles potential errors, like a file not being found.
            try {
                // --- The Core Application Workflow ---
                // Step 1: Read the source file using our FileManager.
                byte[] fileData = fileManager.readFile(sourcePath);

                // Step 2: Process the data (encrypt/decrypt) using our CryptoLogic.
                byte[] processedData = cryptoLogic.processBytes(fileData, key);

                // Step 3: Write the new processed data to the destination file.
                fileManager.writeFile(destPath, processedData);

                // Provide feedback to the user.
                String action = "1".equals(choice) ? "Encryption" : "Decryption";
                System.out.println(action + " successful! Output saved to: " + destPath);

            } catch (IOException e) {
                // If any file error occurs in the 'try' block, this code runs.
                System.err.println("An error occurred: " + e.getMessage());
            }
        }
        // Close the scanner to free up resources.
        scanner.close();
    }
}