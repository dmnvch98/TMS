package com.teachmeskills.lesson11.mainTask;

import com.teachmeskills.lesson10.mainTask.Document;

import static com.teachmeskills.lesson10.Utils.isDocumentNumberEmpty;

public class DocumentService {

    public static boolean isDocumentNumberContainsAbc(Document document) throws CustomException {
        if (isDocumentNumberEmpty(document)) {
            if (document.getDocumentNumber().toUpperCase().contains("ABC")) {
                return true;
            } else {
                throw new CustomException("Последовательности abc нет...");
            }
        } else {
            throw new CustomException("Последовательности abc нет...");
        }
    }

    public static boolean isDocumentNumberStartWithFives(Document document) throws CustomException {
        if (isDocumentNumberContainsSubstring(0, 3, "555", document)) {
            return true;
        } else {
            throw new CustomException("Последовательности 555 нет...");
        }
    }

    public static boolean isDocumentNumberEndsWithValue(Document document) throws CustomException {
        if (isDocumentNumberContainsSubstring(18, 22, "1a2b", document)) {
            return true;
        } else {
            throw new CustomException("Последовательности 1a2b нет...");
        }
    }

    private static boolean isDocumentNumberContainsSubstring(int start, int end, String substring, Document document) throws CustomException {
        if (isDocumentNumberEmpty(document)) {
            String stringToCheck = document.getDocumentNumber().substring(start, end);
            return stringToCheck.equals(substring);
        } else {
            throw new CustomException("Последовательности abc нет...");
        }
    }
}
