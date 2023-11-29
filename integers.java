import java.util.Scanner;
import java.util.StringTokenizer;

public class integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of integers: ");
        String input = scanner.nextLine();
        
        StringTokenizer tokenizer = new StringTokenizer(input);
        int sum = 0;
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);
            System.out.println("Integer: " + number);
            sum += number;
        }
        
        System.out.println("Sum of all integers: " + sum);
        
        scanner.close();
    }
}

