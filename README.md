# SecureFile - Java Encryption Tool 🔐

A robust, command-line application developed in Java that allows users to encrypt and decrypt any file using a secret key. This project demonstrates a strong understanding of core Java principles, file I/O, and software design.


---

### ## About The Project

This tool was built to solve the real-world problem of local data security. It provides a simple, interactive command-line interface (CLI) for users to secure their files quickly without needing complex software. The core of the application is a symmetric encryption engine using an XOR cipher, which is both fast and effective for this use case.

---

### ## Key Features

* **File Encryption:** Makes any file unreadable without the correct key.
* **File Decryption:** Restores encrypted files to their original state.
* **Symmetric Cipher:** Uses the same key for both encryption and decryption.
* **Interactive CLI:** A user-friendly menu-driven interface.
* **Error Handling:** Gracefully handles common errors like file not found.

---

### ## Technologies Used

* **Language:** Java
* **Core Concepts:** Object-Oriented Programming (OOP), File I/O, Exception Handling
* **IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub

---

### ## How To Run Locally

1. Clone the repository:
   ```sh
   git clone [https://github.com/Arshadkh123/SecureFile-Java-Tool.git]

2. Navigate to the project directory:
    ```sh
   cd SecureFile-Java-Tool
3. Compile the Java files from the src directory:
    ```sh
    javac src/SecureFile/*.java
    
4. Run the application:
    ```sh
    java -cp src SecureFile.SecureFile
