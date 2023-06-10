package main.java.HW6SymbolsAndStrings;

public class FindSymbolOccurrence {
    public static int findSymbolOccurrence(String str, char symbol) {
        int count = 0;
        char lowercaseSymbol = Character.toLowerCase(symbol);
        char uppercaseSymbol = Character.toUpperCase(symbol);

        for (char c : str.toCharArray()) {
            if (c == lowercaseSymbol || c == uppercaseSymbol) {
                count++;
            }
        }
        return count;
    }
}