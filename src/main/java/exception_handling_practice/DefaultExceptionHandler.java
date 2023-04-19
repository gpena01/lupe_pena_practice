package exception_handling_practice;

public class DefaultExceptionHandler {
    public static void main(String[] args) {
        // The code below will cause an Exception to occur
        // at runtime: "...ArithmeticException..."
        // This is known as the Default Exception Handler
        System.out.println(3/0);
        System.out.println("I don't get to print..");
    }
}
