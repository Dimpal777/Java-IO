import java.io.FileWriter;
import java.io.IOException;

public class WriterTextFile {
    public static void main(String[] args) {
        // Path to the text file
        String filePath = "example.txt";

        // Text to write to the file
        String text = "Hello, this is a sample text to write to a text file using FileWriter.";

        // Create FileWriter
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            // Write the text to the file
            fileWriter.write(text);
            System.out.println("Text has been successfully written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
