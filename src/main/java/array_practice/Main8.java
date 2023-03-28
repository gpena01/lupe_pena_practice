package array_practice;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        //Write a program that creates a String array of 5 elements and swaps the first
        //element with the middle element without creating a new array
        String[] myElements = {"Hello", "have", "a", "good", "day!"};
        myElements[0] = myElements[2];
        myElements[2] = "Hello";

        System.out.println(Arrays.toString(myElements));
    }
}
