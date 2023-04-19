package exception_handling_practice;

public class StudentInfo {
    public void checkEligibility(int StudentAge, double StudentGpa) {
        if(StudentAge < 18 && StudentGpa < 2) {
            throw new ArithmeticException("Student is not eligible for registration");
        } else {
            System.out.println("Student is eligible for registration");
        }
    }
}
