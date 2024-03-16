import java.io.*;

public class ReadTextFile {
    public static void main(String[] args) {
        // Path to the text file
        String filePath = "example.txt";

        // Create BufferedInputStream
        try (InputStream inputStream = new FileInputStream(filePath);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

            // Read bytes from the input stream
            StringBuilder stringBuilder = new StringBuilder();
            int byteRead;
            while ((byteRead = bufferedInputStream.read()) != -1) {
                // Convert bytes to characters and append to StringBuilder
                char character = (char) byteRead;
                stringBuilder.append(character);
            }

            // Print the text read from the file
            System.out.println("Text from file:");
            System.out.println(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
