package com.teachmeskills.lesson10.mainTask;

import java.util.Locale;

import static com.teachmeskills.lesson10.Utils.isDocumentNumberEmpty;
import static com.teachmeskills.lesson10.Utils.print;

public class DocumentService {
    private final static String DOCUMENT_HAS_NOT_NUMBER = "У документа нет номера";
    private final static StringBuilder stringBuilder = new StringBuilder();

    public static void getDocumentPeriodNumbers(Document document) {
        if (isDocumentNumberEmpty(document)) {
            stringBuilder
                    .append(document.getDocumentNumber(), 0, 4)
                    .append(document.getDocumentNumber(), 9, 13);
            print(stringBuilder);
            stringBuilder.setLength(0);
        }
    }

    public static void replaceCharPeriodsToAsterisks(Document document) {
        if (isDocumentNumberEmpty(document)) {
            stringBuilder.append(document.getDocumentNumber());
            stringBuilder
                    .replace(5, 8, "***")
                    .replace(14, 17, "***");
            print(stringBuilder);
            stringBuilder.setLength(0);
        }
    }

    public static String getAllCharsSeparatedBySlashLowercase(Document document) {
        if (isDocumentNumberEmpty(document)) {
            stringBuilder.setLength(0);
            stringBuilder.append(document.getDocumentNumber());
            stringBuilder
                    .delete(0, 5)
                    .replace(3, 9, "/")
                    .replace(7, 9, "/")
                    .replace(9, 10, "/");
            return stringBuilder
                    .toString()
                    .toLowerCase();
        } else {
            return "";
        }
    }

    public static StringBuilder getAllCharsSeparatedBySlashUppercase(Document document) {
        if (isDocumentNumberEmpty(document)) {
            String allCharsSeparatedBySlash = getAllCharsSeparatedBySlashLowercase(document).toUpperCase();
            stringBuilder.setLength(0);
            return stringBuilder
                    .append("Letters:")
                    .append(allCharsSeparatedBySlash);
        } else {
            return new StringBuilder();
        }
    }

    public static boolean isDocumentNumberContainsAbc(Document document) {
        if (isDocumentNumberEmpty(document)) {
            return document.getDocumentNumber().toUpperCase().contains("ABC");
        } else return false;
    }

    public static boolean isDocumentNumberStartWithFives(Document document) {
        return isDocumentNumberContainsSubstring(0, 3, "555", document);
    }

    public static boolean isDocumentNumberEndsWithValue(Document document) {
        return isDocumentNumberContainsSubstring(18, 22, "1a2b", document);
    }

    private static boolean isDocumentNumberContainsSubstring(int start, int end, String substring, Document document) {
        if (isDocumentNumberEmpty(document)) {
            String stringToCheck = document.getDocumentNumber().substring(start, end);
            return stringToCheck.equals(substring);
        } else return false;
    }
}
