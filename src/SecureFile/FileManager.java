// File: SecureFile/FileManager.java
package SecureFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Manages reading from and writing to files on the disk.
 * This class isolates all file handling logic in one place.
 */
public class FileManager {

    /**
     * Reads all bytes from a file at the given path.
     *
     * @param path The full path to the file to be read.
     * @return A byte array containing all the data from the file.
     * @throws IOException if the file cannot be found or there's an error reading it.
     */
    public byte[] readFile(String path) throws IOException {
        // 'try-with-resources' automatically closes the file stream when done.
        try (FileInputStream fis = new FileInputStream(path)) {
            // Reads all bytes from the input stream and returns them.
            return fis.readAllBytes();
        }
    }

    /**
     * Writes a given byte array to a new file at the specified path.
     *
     * @param path The full path where the new file will be created/overwritten.
     * @param data The byte array of data to write to the file.
     * @throws IOException if there is an error writing the file.
     */
    public void writeFile(String path, byte[] data) throws IOException {
        // 'try-with-resources' ensures the file is properly closed after writing.
        try (FileOutputStream fos = new FileOutputStream(path)) {
            // Writes the entire byte array to the file.
            fos.write(data);
        }
    }
}