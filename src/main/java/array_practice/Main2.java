package array_practice;

public class Main2 {
    public static void main(String[] args) {
        //Write a program that returns the middle element in an array. Give the following
        //values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
        int[] myArray = {13, 5, 7, 68, 2};

        int lengthOfMyArray = myArray.length;
        int median = lengthOfMyArray / 2;
        int middleValue = myArray[median];

        System.out.println("The middle value of my array is: " + middleValue);

    }
}
