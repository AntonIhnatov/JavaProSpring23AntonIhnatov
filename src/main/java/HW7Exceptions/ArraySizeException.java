package main.java.HW7Exceptions;

public class ArraySizeException extends Exception{
    public ArraySizeException(String message) {
        super(message);
        System.out.println("My ArraySizeException message");
    }
}
