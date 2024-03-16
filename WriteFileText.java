import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteFileText {
    public static void main(String[] args) {
        // Path to the text file
        String filePath = "example.txt";

        // Text to write to the file
        String text = "Hello, this is a sample text to write to a text file.";

        // Create OutputStream
        try (OutputStream outputStream = new FileOutputStream(filePath)) {
            // Convert the text to bytes and write to the output stream
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
            System.out.println("Text has been successfully written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
