import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fhand{
    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            writer.close();


            FileReader reader = new FileReader("output.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

