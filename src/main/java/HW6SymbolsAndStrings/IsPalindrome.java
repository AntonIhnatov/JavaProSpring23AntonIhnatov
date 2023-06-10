package main.java.HW6SymbolsAndStrings;

import static main.java.HW6SymbolsAndStrings.StringReverse.reverseString;

public class IsPalindrome {
    public static boolean isPalindrome(String str){
        String reversedStr = reverseString(str);
        return str.equals(reversedStr);
    }
}
