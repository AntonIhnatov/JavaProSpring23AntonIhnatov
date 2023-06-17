package main.java.HW6SymbolsAndStrings;

import java.util.Scanner;

import static main.java.HW6SymbolsAndStrings.IsSentencePalindrome.IsSentencePalindrome;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------------------------------");

        String inputString = "You're my heart, you're my soul";
        char targetSymbol = 'y';

        int occurrences = FindSymbolOccurrence.findSymbolOccurrence(inputString, targetSymbol);
        System.out.println("Цей символ '" + targetSymbol + "' зустрічається " + occurrences + " разів у цьому рядку");

        System.out.println("--------------------------------------------------------------------------------------------------");

        String source1 = "People";
        String target1 = "ple";
        int position1 = FindWordPosition.findWordPosition(source1, target1);
        System.out.println("Результат 1: " + position1);

        String source2 = "Orange";
        String target2 = "carrot";
        int position2 = FindWordPosition.findWordPosition(source2, target2);
        System.out.println("Результат 2: " + position2);

        System.out.println("--------------------------------------------------------------------------------------------------");

        String source3 = "Independence";
        String reverseString = StringReverse.reverseString(source3);
        System.out.println(reverseString);

        System.out.println("--------------------------------------------------------------------------------------------------");

        String source4 = "level";
        Boolean palindromeString1 = IsPalindrome.isPalindrome(source4);
        System.out.println(palindromeString1);

        String source5 = "Alloha";
        Boolean palindromeString2 = IsPalindrome.isPalindrome(source5);
        System.out.println(palindromeString2);

        System.out.println("--------------------------------------------------------------------------------------------------");

        String input = "Сало, сало, сало, українське сало!";
        if (IsSentencePalindrome(input)) {
            System.out.println("Рядок є паліндромом.");
        } else {
            System.out.println("Рядок не є паліндромом");
        }


        String input1 = "І що сало? Ласощі…";
        if (IsSentencePalindrome(input1)) {
            System.out.println("Рядок є паліндромом");
        } else {
            System.out.println("Рядок не є паліндромом");
        }

        System.out.println("--------------------------------------------------------------------------------------------------");


        Scanner scanner = new Scanner(System.in);
        boolean isGuessed = false;

        System.out.println("Гра \"Вгадай слово\". Спробуйте відгадати загадане слово.");
        System.out.println("Для виходу з гри введіть 'exit'.");

        String secretWord = GameHelper.GetRandomWord();
        String guessedWord = GameHelper.generateMaskedWord(secretWord);

        System.out.println("Початкове слово: " + guessedWord);

        while (!isGuessed) {
            System.out.print("Введіть вашу відповідь: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("Гра завершена. Загадане слово: " + secretWord);
                break;
            }

            if (userInput.equals(secretWord)) {
                System.out.println("Ви відгадали слово! Перемога!");
                isGuessed = true;
            } else {
                guessedWord = GameHelper.getMaskedWord(secretWord, userInput, guessedWord);
                System.out.println("Поточне слово: " + guessedWord);
            }
        }

    }
}
