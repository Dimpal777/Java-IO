import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
    public static void main(String[] args) {
        // Path to your text file
        String filePath = "your_file_path_here.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read lines from the file until reaching the end
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
