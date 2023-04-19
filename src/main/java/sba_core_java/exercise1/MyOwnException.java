package sba_core_java.exercise1;

public class MyOwnException extends Exception {
    // when creating an exception class:
    // make sure it extends the exception like on line 3
    // make sure to create a custom constructor that takes a
    // string, calls a super() and passes the string like on line 9
    public MyOwnException(String error) {
        super(error);
    }
}
