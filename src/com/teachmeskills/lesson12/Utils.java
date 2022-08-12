package com.teachmeskills.lesson12;

import java.io.File;
import java.io.FileNotFoundException;
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
}
