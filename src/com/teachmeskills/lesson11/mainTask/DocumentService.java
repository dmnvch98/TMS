package com.teachmeskills.lesson11.mainTask;

import com.teachmeskills.lesson10.mainTask.Document;

import java.util.Objects;

public class DocumentService {

    public static boolean isDocumentNumberContainsSubstring(Document document, String substring) {
        try {
            if (isDocumentNumberNotEmpty(document)) {
                if (document.getDocumentNumber().toUpperCase().contains(substring)) {
                    return true;
                } else {
                    throw new DocumentNumberNotContainsSubstringException("Последовательности " + substring + " нет");
                }
            } else {
                return false;
            }
        } catch (DocumentNumberFormatException | DocumentNumberNotContainsSubstringException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isDocumentNumberStartWithSubString(Document document, String substring) {
        try {
            if (isDocumentNumberNotEmpty(document)) {
                if (document.getDocumentNumber().startsWith(substring)) {
                    return true;
                } else {
                    throw new DocumentNumberNotStartsWithSubstringException("Номер документа не начинается с "
                            + substring);
                }
            } else {
                return false;
            }
        } catch (DocumentNumberNotStartsWithSubstringException | DocumentNumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isDocumentNumberEndsWithSubString(Document document, String substring) {
        try {
            if (isDocumentNumberNotEmpty(document)) {
                if (document.getDocumentNumber().endsWith(substring)) {
                    return true;
                } else {
                    throw new DocumentNumberNotEndsWithSubstringException("Номер документа не заканчивается на "
                            + substring);
                }
            } else {
                return false;
            }
        } catch (DocumentNumberNotEndsWithSubstringException | DocumentNumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isDocumentNumberNotEmpty(Document document) throws DocumentNumberFormatException {
        if (!Objects.isNull(document.getDocumentNumber())) {
            return true;
        } else {
            throw new DocumentNumberFormatException();
        }
    }
}
