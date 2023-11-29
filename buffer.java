import java.util.Scanner;

public class buffer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String mstr = in.nextLine();
        
        System.out.println("Enter the operation number (1, 2, or 3): ");
        int operation = in.nextInt();
        
        switch (operation) {
            case 1:
                System.out.println("Enter the string to insert: ");
                String istr = in.next();
                System.out.println("Enter the position to insert: ");
                int insertPosition = in.nextInt();
                String result1 = mstr.substring(0, insertPosition) + istr + mstr.substring(insertPosition);
                System.out.println("Result: " + result1);
                break;
                
            case 2:
                System.out.println("Enter the position to modify: ");
                int mod = in.nextInt();
                System.out.println("Enter the new character: ");
                char newChar = in.next().charAt(0);
                char[] charArray = mstr.toCharArray();
                charArray[mod] = newChar;
                String result2 = new String(charArray);
                System.out.println("Result: " + result2);
                break;
                
            case 3:
                System.out.println("Enter the string to append: ");
                String appendString = in.next();
                String result3 = mstr + appendString;
                System.out.println("Result: " + result3);
                break;
                
            default:
                System.out.println("Invalid operation number!");
                break;
        }
        
        in.close();
    }
}

