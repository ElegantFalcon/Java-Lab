import java.util.Arrays;
import java.util.Scanner;

public class stringsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }
        Arrays.sort(strings);
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
        sc.close();
    }
}
