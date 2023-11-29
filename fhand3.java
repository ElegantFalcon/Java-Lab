import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fhand3 {
    public static void main(String[] args) {
        String fileName = "trial.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

