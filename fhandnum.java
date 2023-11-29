import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fhandnum {
    public static void main(String[] args) {
        String filePath = "num.txt";
        int characterCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                characterCount += line.length();
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
    }
}

