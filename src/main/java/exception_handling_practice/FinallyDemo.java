package exception_handling_practice;

public class FinallyDemo {
    public static void main(String[] args) throws Exception {
        myMethod(3);
    }
    static void myMethod(int n) throws Exception {
        try {
            switch (n) {
                case 1:
                    System.out.println("1st case");
                case 3:
                    System.out.println("3rd case");
                case 4:
                    System.out.println("4th case");
                    throw new Exception("4!");
                case 2:
                    System.out.println("2nd case");
            }
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("try-block entered.");
        }
    }
}
