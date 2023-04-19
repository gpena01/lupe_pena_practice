package exception_handling_practice;

public class myRunner {
    public static void main(String[] args) {
        try {
            // this try block calls the above method so handle the exception
            Example_Throws obj = new Example_Throws();
            obj.testMethod(1);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
