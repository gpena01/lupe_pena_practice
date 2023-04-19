package exception_handling_practice;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            ThrowingClass.meth();
        }
        // The main() method catches and handles it
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

class ThrowingClass {
    static void meth() throws ClassNotFoundException {
        // Let's say the method logic can cause ClassNotFoundException,
        // which is a checked exception.
        // This meth() method either catches it or passes it along the
        // chain as shown above.
        throw new ClassNotFoundException("demo");
    }
}
