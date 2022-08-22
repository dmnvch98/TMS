package com.teachmeskills.lesson13.mainTask;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class Utils {
    private static final String ASK_USER_PATH_TO_FILE = "Введите путь к файлу и его название: ";
    private static Scanner scanner = new Scanner(System.in);;
    private Utils() {
    }

    private static String askData() {
        System.out.print(ASK_USER_PATH_TO_FILE);
        return scanner.nextLine();
    }

    public static ArrayList<String> collectData() {
        ArrayList<String> pathAndNames = new ArrayList<>();
        String enteredValue = askData();
        while (!(enteredValue.equals("0"))) {
            String temp = enteredValue.replace(" ", "/");
            pathAndNames.add(temp);
            enteredValue = askData();
        }
        return pathAndNames;
    }

    public static ArrayList<String> readFileAndReturnValues(String path) {
        File documentNumbersFile = new File(path);
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

    public static void createFileAndWrite(String filename, HashMap<String, String> docnums) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(filename), StandardCharsets.UTF_8))) {
            for (Map.Entry<String, String> entry : docnums.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
