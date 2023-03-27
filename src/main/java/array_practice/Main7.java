package array_practice;

public class Main7 {
    public static void main(String[] args) {
        //Write a program where you create an array of 5 elements. Loop through the
        //array and print the value of each element, except for the middle (index 2)
        //element
        String[] myArray = {"I", "love", "hate", "Java", "...yup!"};
        int lengthOfArray = myArray.length;
        int median = lengthOfArray / 2;

        for (int i = 0; i < myArray.length; i++) {
            if (i == median) {
                continue;
            }
                System.out.println(myArray[i]);
        }
    }
}
