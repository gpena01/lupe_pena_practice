package treeset_practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleOne {
    public static void main(String[] args) {
        TreeSet<Integer> numTreeSet = new TreeSet<>();
        numTreeSet.add(20);
        numTreeSet.add(5);
        numTreeSet.add(15);
        numTreeSet.add(25);
        numTreeSet.add(10);
        System.out.println(numTreeSet);

        // Call iterator() method to define Iterator for TreeSet
        Iterator<Integer> iterSet = numTreeSet.iterator();
        System.out.println("TreeSet using Iterator: ");
        // Access TreeSet elements using Iterator
        while(iterSet.hasNext()) {
            System.out.print(iterSet.next());
            System.out.print(", ");
        }
    }
}
