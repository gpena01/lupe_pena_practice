package generics_method;

public class MyRunner2 {
    public static void main(String[] args) {
        // initialize generic class
        // with String and Integer data

        GMultipleDataType<String, Integer> mObj = new GMultipleDataType("Per Scholas", 11025);

        System.out.println(mObj.getValueOne());
        System.out.println(mObj.getValueTwo());

        // initialize generic class
        // with String and String data
        GMultipleDataType<String, String> mObj2 = new GMultipleDataType("Per Scholas", "Non profit");

        System.out.println(mObj2.getValueOne());
        System.out.println(mObj2.getValueTwo());
    }
}
