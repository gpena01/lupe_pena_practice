package array_practice;

public class Main1 {
    public static void main(String[] args) {
        int[] myArray = {2, 4, 6};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        for (int myInt : myArray) {
            System.out.println(myInt);
        }
    }
}
