package exception_handling_practice;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

public class MethodWithExceptionHandler {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
            System.out.println("Please print me.");
        } catch (ArithmeticException exc) {
            //Division by zero is and ArithmeticException
            System.out.println(exc);
        }
        System.out.println("After exception");
    }
}
