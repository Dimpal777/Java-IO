import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFile {
    public static void main(String[] args) {
        // Path to your properties file
        String filePath = "config.properties";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            Properties properties = new Properties();

            // Load properties from the file
            properties.load(fis);

            // Read properties
            String databaseUrl = properties.getProperty("database.url");
            String databaseUsername = properties.getProperty("database.username");
            String databasePassword = properties.getProperty("database.password");

            // Print properties
            System.out.println("Database URL: " + databaseUrl);
            System.out.println("Database Username: " + databaseUsername);
            System.out.println("Database Password: " + databasePassword);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
