package com.teachmeskills.lesson11.mainTask;

import com.teachmeskills.lesson10.mainTask.Document;

import java.util.Objects;

public class DocumentService {

    public static boolean isDocumentNumberContainsAbc(Document document) {
        try {
            if (isDocumentNumberEmpty(document)) {
                if (document.getDocumentNumber().toUpperCase().contains("ABC")) {
                    return true;
                } else {
                    throw new CustomException("Последовательности abc нет...");
                }
            } else {
                throw new DocumentNumberFormatException();
            }
        } catch (CustomException | DocumentNumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isDocumentNumberStartWithFives(Document document) {
        try {
            if (isDocumentNumberContainsSubstring(0, 3, "555", document)) {
                return true;
            } else {
                throw new CustomException("Последовательности 555 нет...");
            }
        } catch (CustomException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isDocumentNumberEndsWithValue(Document document) {
        try {
            if (isDocumentNumberContainsSubstring(18, 22, "1a2b", document)) {
                return true;
            } else {
                throw new CustomException("Последовательности 1a2b нет...");
            }
        } catch (CustomException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean isDocumentNumberContainsSubstring(int start, int end, String substring, Document document) {
        try {
            if (isDocumentNumberEmpty(document)) {
                String stringToCheck = document.getDocumentNumber().substring(start, end);
                return stringToCheck.equals(substring);
            } else return false;
        } catch (DocumentNumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isDocumentNumberEmpty(Document document) throws DocumentNumberFormatException {
        if (!Objects.isNull(document.getDocumentNumber())) {
            return true;
        } else {
            throw new DocumentNumberFormatException();
        }
    }
}
