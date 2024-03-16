import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        // Path to the text file
        String filePath = "example.txt";

        // Create InputStream
        try (InputStream inputStream = new FileInputStream(filePath)) {
            // Read bytes from the input stream
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                // Convert bytes to characters and print
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
