package array_practice;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        // Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1,
        // 0}. Print the array in ascending order, and print the smallest and the largest
        // element of the array. The output will look like the following:
        // Array in ascending order: 0, 1, 2, 4, 9, 13
        // The smallest number is 0
        // The biggest number is 13

        int[] numbers = {4, 2, 9, 13, 1, 0};
        Arrays.sort(numbers);

        int max = numbers[0];
        int min = numbers[0];
        int i;

        for (i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);
    }
}
