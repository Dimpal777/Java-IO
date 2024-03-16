import java.io.*;

public class ReaderTextFile {
    public static void main(String[] args) {
        // Path to the text file
        String filePath = "example.txt";

        // Create FileReader
        try (FileReader fileReader = new FileReader(filePath)) {
            // Create a BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read text line by line
            String line;
            System.out.println("Text from file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
