package generic_method_practice;

public class GenericMethodExample {
    public <T> void printValues(T value) {
        System.out.println("Value: " + value);
    }
    public static <T> void staticDisplayData(T value) {
        System.out.println(value);
    }
    public static <E> void printArray(E[] elements) {
        for(E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }
}
