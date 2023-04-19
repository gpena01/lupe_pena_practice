package sba_core_java.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
            System.out.println(value);
        } else {
            try {
                // line 15 causes the error bc I'm throwing the exception
                throw new MyOwnException("Invalid integer");
                // line 17 catches the exception prevents program from crashing
            } catch (MyOwnException e) {
                // this block is the list of steps programmer wants to do to handle the exception
                System.out.println(e.getMessage());
            }
        }
        String[] myStringArrayTestValue = {"life",
                "is",
                "worth",
                "living",
                "with",
                "passion"};
        MyOperation myOperation = new MyOperation();
        myOperation.convertStringArrayIntoArrayList(myStringArrayTestValue);
        myOperation.replaceAnElementInTheStringArrayListGiven(1);
        myOperation.createANewArrayListFromExistingArray();

        System.out.println(myOperation.createANewArrayListFromExistingArray());
        System.out.println(myOperation.getMyArrayList());
    }
}
