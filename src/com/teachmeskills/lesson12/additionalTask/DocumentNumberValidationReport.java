package com.teachmeskills.lesson12.additionalTask;

import com.teachmeskills.lesson12.mainTask.DocumentNumberValidator;

import java.util.ArrayList;

import static com.teachmeskills.Utils.print;
import static com.teachmeskills.lesson12.Utils.readFileAndReturnValues;

//нет докнам, контракт, есть спец символы, нет цифр, нет букв, не 15 символов

public class DocumentNumberValidationReport {
    public final static int DOCUMENT_NUMBER_LENGTH = 15;
    public final static String DOCNUM = "DOCNUM";
    public final static String CONTRACT = "CONTRACT";
    public final static String DOCUMENT_NUMBER_LENGTH_LESS_THEN = "длина номера документа не ";
    public final static String DOCUMENT_NUMBER_NOT_STARTS_WITH = "номер документа не начинается с ";

    public static void isDocumentNumberValid() {
        ArrayList<String> documentNumbersList = readFileAndReturnValues();
        ArrayList<String> documentNumbersList2 = new ArrayList<>();
        for (String documentNumber: documentNumbersList) {
            documentNumbersList2.add(documentNumber + " : " + performDocumentNumberTests(documentNumber));
        }
        System.out.println();
    }

    private static String performDocumentNumberTests(String documentNumber) {
        return isDocumentNumberFifteenLength(documentNumber) +
                isDocumentNumberStartsDocnumOrContract(documentNumber);
    }

    private static String isDocumentNumberFifteenLength(String documentNumber) {
        if (!(documentNumber.length() == DOCUMENT_NUMBER_LENGTH)) {
            return DOCUMENT_NUMBER_LENGTH_LESS_THEN + " " + DOCUMENT_NUMBER_LENGTH + ". ";
        } else {
            return "";
        }
    }

    private static String isDocumentNumberStartsDocnumOrContract(String documentNumber) {
        if (!(documentNumber.startsWith(DOCNUM) || documentNumber.startsWith(CONTRACT))) {
            return DOCUMENT_NUMBER_NOT_STARTS_WITH + " " + DOCNUM + " / " + CONTRACT + ". ";
        } else {
            return "";
        }
    }
}
