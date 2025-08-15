package SecureFile;

public class CryptoLogic {
        /**
         * Processes byte data using a simple XOR cipher with the given key.
         * This method works for both encryption and decryption because XORing data
         * with the same key twice returns the original data.
         *
         * @param data The byte array from the file to be processed.
         * @param key  The secret key to use for the cipher.
         * @return The processed byte array (either encrypted or decrypted).
         */
        public byte[] processBytes(byte[] data, String key) {
            // Convert the secret key string into an array of bytes.
            byte[] keyBytes = key.getBytes();
            // Create a new byte array to store the result, with the same size as the input data.
            byte[] processedData =  new byte[data.length];

            // Loop through every single byte of the input file data.
            for (int i = 0; i < data.length; i++) {
                // The core XOR operation.
                // It takes a data byte and a key byte and performs a bitwise XOR.
                // The '%' (modulo) operator makes the key repeat if it's shorter than the data,
                // ensuring every data byte is processed.
                processedData[i] = (byte) (data[i] ^ keyBytes[i % keyBytes.length]);
            }

            // Return the newly created array containing the processed data.
            return processedData;
        }
    }
