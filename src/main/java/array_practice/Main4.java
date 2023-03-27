package array_practice;

public class Main4 {
    public static void main(String[] args) {
        // Write a program that creates an integer array with 5 elements (i.e., numbers).
        // The numbers can be any integers. Print out the value at the first index and the
        // last index using length - 1 as the index. Now try printing the value at index =
        // length ( e.g., myArray[myArray.length ] ). Notice the type of exception which is
        // produced. Now try to assign a value to the array index 5. You should get the
        // same type of exception
        int[] myNumbers = {1, 2, 3, 4, 5};
        int firstValue = myNumbers[0];
        int lastValue = myNumbers[myNumbers.length - 1];
        // int someValue = myNumbers[myNumbers.length];
        // int myNumbers[5] = 23;
        System.out.println(firstValue);
        System.out.println(lastValue);
        // System.out.println(someValue);
    }
}
