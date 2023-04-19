package treeset_practice;

import java.util.Comparator;

public class Cities_Comparator implements Comparator<String> {
    // override compare method to compare two elements of the TreeSet
    @Override
    public int compare(String citiesOne, String citiesTwo) {
        int value = citiesOne.compareTo(citiesTwo);
        // sort elements in reverse order
        if(value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
