package com.teachmeskills.lesson10;

import com.teachmeskills.lesson10.mainTask.Document;
import com.teachmeskills.lesson10.mainTask.DocumentService;

import java.util.Objects;

public final class Utils {
    public final static String DOCUMENT_HAS_NOT_NUMBER = "У документа нет номера";
    private Utils() {
    }

    public static void print(Object object) {
        System.out.println(object);
    }

    public static boolean isDocumentNumberEmpty(Document document) {
        if (!Objects.isNull(document.getDocumentNumber())) {
            return true;
        } else {
            print(DOCUMENT_HAS_NOT_NUMBER);
            return false;
        }
    }
}
