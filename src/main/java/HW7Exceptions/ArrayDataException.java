package main.java.HW7Exceptions;

public class ArrayDataException extends Exception{
    public ArrayDataException(String message) {
        super(message);
        System.out.println("My ArrayDataException message");
    }
}
