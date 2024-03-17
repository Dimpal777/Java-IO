import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void main(String[] args) {
        // Path to your text file
        String filePath = "your_file_path_here.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Text to be written to the file
            String text = "Hello, this is some text written to the file.\n";
            text += "This is another line of text.\n";
            text += "And yet another line.";

            // Write the text to the file
            bw.write(text);

            System.out.println("Text has been written to the file.");
        } catch (IOException e) {
            // Handle any IOException (e.g., file not found, permission denied, etc.)
            e.printStackTrace();
        }
    }
}
