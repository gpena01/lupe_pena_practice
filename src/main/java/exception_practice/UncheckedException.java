package exception_practice;

import java.io.FileNotFoundException;

public class UncheckedException {
    // an example of unchecked exception
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {
        method2();
    }
    private static void method2() {
        method3();
    }
    private static void method3() {
        throw new RuntimeException();
    }
}
