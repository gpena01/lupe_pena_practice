package array_practice;

public class Main5 {
    public static void main(String[] args) {
        //Write a program where you create an integer array with a length of 5. Loop
        //through the array and assign the value of the loop control variable (e.g., i) to
        //the corresponding index in the array
        int[] myNumbers = {3, 6, 7, 10, 23};
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(i + ": " + myNumbers[i]);
        }
    }
}
