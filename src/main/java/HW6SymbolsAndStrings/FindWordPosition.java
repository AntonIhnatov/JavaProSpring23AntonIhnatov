package main.java.HW6SymbolsAndStrings;

public class FindWordPosition {
    public static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target);
        } else {
            return -1;
        }
    }
}
