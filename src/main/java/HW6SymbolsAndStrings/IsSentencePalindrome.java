package main.java.HW6SymbolsAndStrings;

public class IsSentencePalindrome {
    public static boolean IsSentencePalindrome(String input) {
        // Видаляємо небажані символи з рядка
        String cleanInput = input.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();
        // Перевертаємо рядок
        String reversed = new StringBuilder(cleanInput).reverse().toString();
        // Порівнюємо очищений рядок з його перевернутою версією
        return cleanInput.equalsIgnoreCase(reversed);

    }
}
