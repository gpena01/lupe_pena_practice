package exception_handling_practice;

public class StudentRunnerClass {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Welcome to the registration process");
        StudentInfo student = new StudentInfo();
        student.checkEligibility(16, 1.6);
        System.out.println("Have a nice day...");
    }
}
