package generic_method_practice;

public class MyRunner {
    public static void main(String[] args) {
        System.out.println("===invoking regular method===");
        GenericMethodExample obj = new GenericMethodExample();
        obj.printValues(43);
        obj.printValues("Programmer");
        obj.printValues(54.43);
        obj.printValues(true);

        System.out.println("===invoking static method===");
        GenericMethodExample.staticDisplayData(254);
        GenericMethodExample.staticDisplayData("Java Developer");
        GenericMethodExample.staticDisplayData(254.25);

        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J', 'A', 'V', 'A'};
        System.out.println("Printing Integer Array");
        GenericMethodExample.printArray(intArray);
        System.out.println("Printing Character Array");
        GenericMethodExample.printArray(charArray);
    }
}
