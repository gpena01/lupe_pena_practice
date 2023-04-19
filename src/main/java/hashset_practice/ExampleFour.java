package hashset_practice;

import java.util.HashSet;

public class ExampleFour {
    public static void main(String[] args) {
        // HashSet declaration
        HashSet<String> hSet = new HashSet<String>();

        // Adding elements to the HashSet
        hSet.add("Apple");
        hSet.add("Mango");
        hSet.add("Grapes");
        hSet.add("Orange");
        hSet.add("Fig");
        System.out.println(hSet);
        // Addition of duplicate elements
        hSet.add("Apple");
        hSet.add("Mango");
        System.out.println(hSet);
        // Addition of null values
        hSet.add(null);
        hSet.add(null);
        hSet.add("apple");
        hSet.add("Banana");
        hSet.add("Strawberries");
        hSet.add("Pineapple");
        System.out.println(hSet);

        // Using advanced for loop
        for (String str : hSet) {
            System.out.println("---> " + str);
        }
    }
}
