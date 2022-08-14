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
                    throw new NoAbcSubstringException();
                }
            } else {
                return false;
            }
        } catch (DocumentNumberFormatException | NoAbcSubstringException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isDocumentNumberStartWithFives(Document document) {
        try {
            if (isDocumentNumberEmpty(document)) {
                if (document.getDocumentNumber().startsWith("555")) {
                    return true;
                } else {
                    throw new No555SubstringException("Последовательности 555 нет");
                }
            } else {
                return false;
            }
        } catch (No555SubstringException | DocumentNumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isDocumentNumberEndsWithValue(Document document) {
        try {
            if (isDocumentNumberEmpty(document)) {
                if (document.getDocumentNumber().endsWith("1a2b")) {
                    return true;
                } else {
                    throw new No1a2bSubstringException();
                }
            } else {
                return false;
            }
        } catch (No1a2bSubstringException | DocumentNumberFormatException e) {
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
