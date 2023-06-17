package main.java.HW8InputOutputStreams;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFolders();
        writeToFile();
        traverseFolders("resources");
    }

    public static void createFolders() {
        String[] folderNames = {"folder1", "folder2", "folder3", "folder4", "folder5", "folder6", "folder7", "folder8"};

        for (String folderName : folderNames) {
            File folder = new File("resources/" + folderName);
            if (!folder.exists()) {
                folder.mkdirs();
            }
        }
    }

    public static void writeToFile() {
        String[] folderNames = {"folder1", "folder2", "folder3", "folder4", "folder5", "folder6", "folder7", "folder8"};

        for (int i = 0; i < folderNames.length; i++) {
            if (i % 2 == 1) {
                String filePath = "resources/" + folderNames[i] + "/file.txt";
                String phrase = readPhraseFromConsole();

                try (FileWriter writer = new FileWriter(filePath)) {
                    writer.write(phrase);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String readPhraseFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть фразу: ");
        return scanner.nextLine();
    }

    public static void traverseFolders(String path) {
        File directory = new File(path);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    traverseFolders(file.getPath());
                } else {
                    System.out.println("Файл: " + file.getName());
                    System.out.println("Вміст: ");
                    readFileContents(file);
                    System.out.println();
                }
            }
        }
    }

    public static void readFileContents(File file) {
        try (FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
             String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
