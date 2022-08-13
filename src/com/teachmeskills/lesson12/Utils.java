package com.teachmeskills.lesson12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

import static com.teachmeskills.Utils.print;

public final class Utils {
    private static final String ASK_USER_PATH_TO_FILE = "Введите путь к файлу";
    private static Scanner scanner;

    private Utils() {
    }

    public static String askUserEnterPath() {
        print(ASK_USER_PATH_TO_FILE);
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static ArrayList<String> readFileAndReturnValues() {
        File documentNumbersFile = new File(askUserEnterPath());
        try {
            scanner = new Scanner(documentNumbersFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> documentNumbersList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            documentNumbersList.add(scanner.nextLine());
        }
        return documentNumbersList;
    }

    public static void createFileAndWrite(String filename, ArrayList<String> docnums) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(filename), StandardCharsets.UTF_8))) {
            //writer.write("something");
            for (String documentNumber: docnums) {
                writer.write(documentNumber + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
