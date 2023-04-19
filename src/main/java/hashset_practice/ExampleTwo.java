package hashset_practice;

import java.util.HashSet;

public class ExampleTwo {
    public static void main(String[] args) {
        // Create an object with variable name "evenNumbers" and use add() method
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        // Create another object with variable name "numbers" and use add() method
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        // Union of two set
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);
    }
}
