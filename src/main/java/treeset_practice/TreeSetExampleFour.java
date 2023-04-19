package treeset_practice;

import java.util.TreeSet;

public class TreeSetExampleFour {
    public static void main(String[] args) {
        // Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new Cities_Comparator());
        // add elements to the comparator
        cities.add("Washington D.C.");
        cities.add("Mexico City");
        cities.add("New York City");
        cities.add("San Francisco");
        cities.add("Miami");
        cities.add("Boston");
        cities.add("Colorado Springs");
        cities.add("Lake Tahoe");
        cities.add("Tokyo");

        // Print the contents of TreeSet
        System.out.println("TreeSet: " + cities);
    }
}
