package main.java.HW6SymbolsAndStrings;

public class GameHelper {
    private static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static String GetRandomWord(){
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }

    public static String generateMaskedWord(String word) {
        StringBuilder maskedWord = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            maskedWord.append("#");
        }
        return maskedWord.toString();
    }

    public static String getMaskedWord(String secretWord, String userInput, String guessedWord) {
        StringBuilder newGuessedWord = new StringBuilder(guessedWord);

        for (int i = 0; i < secretWord.length(); i++) {
            if (userInput.length() > i && userInput.charAt(i) == secretWord.charAt(i)) {
                newGuessedWord.setCharAt(i, secretWord.charAt(i));
            }
        }

        return newGuessedWord.toString();
    }
}
