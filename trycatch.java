public class trycatch {
    public static void main(String[] args) {
        try {

            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");
        } finally {

            System.out.println("Program execution completed.");
        }
    }

    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {

            throw new ArithmeticException();
        }
        return dividend / divisor;
    }
}

