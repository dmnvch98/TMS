package com.teachmeskills.lesson13;

import com.teachmeskills.lesson12.mainTask.DocumentNumberValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static com.teachmeskills.lesson13.Utils.*;
public class DocumentNumberValidationReport {
    public final static int DOCUMENT_NUMBER_LENGTH = 15;
    public final static String DOCNUM = "DOCNUM";
    public final static String CONTRACT = "CONTRACT";
    public final static String DOCUMENT_NUMBER_LENGTH_LESS_THEN = "Длина номера документа не ";
    public final static String DOCUMENT_NUMBER_NOT_STARTS_WITH = "Номер документа не начинается с ";
    public final static String DOCUMENT_NUMBER_CONTAINS_SPECIAL_SYMBOLS = "Номер документа содержит спец символы. ";
    public final static String DOCUMENT_NUMBER_NOT_CONTAINS_DIGITS = "Номер документа не содержит цифр ";
    public final static String DOCUMENT_NUMBER_NOT_CONTAINS_LETTERS = "Номер документа не содержит букв ";

    public final static String VALID = "VALID";
    public final static String INVALID = "INVALID. ";
    public final static String SPECIAL_SYMBOLS_REGEX = "[a-zA-Z0-9 ]*";
    public final static String DIGITS_REGEX = ".*\\d.*";
    public final static String LETTERS_REGES = ".*[a-zA-Z]+.*";
    public static HashMap<String, String> validatedDocumentNumbers = new HashMap<>();

    public static void validateAllDocuments() {
        HashSet<String> pathsAndNames = new HashSet<>(Utils.collectData());
        for (String path: pathsAndNames) {
            validateDocumentNumbers(path);
        }
        System.out.println();
    }

    public static void validateDocumentNumbers(String path) {
        ArrayList<String> documentNumbersList = readFileAndReturnValues(path);
        for (String documentNumber: documentNumbersList) {
            String documentNumberTemp = documentNumber.toUpperCase();
            if (!(documentNumberTemp.matches(DocumentNumberValidator.regexPatternFirst) ||
                    documentNumberTemp.matches(DocumentNumberValidator.regexPatternSecond))) {
                validatedDocumentNumbers.put(documentNumber, INVALID + performDocumentNumberTests(documentNumber));
            } else {
                validatedDocumentNumbers.put(documentNumber, VALID);
            }
        }
        createFileAndWrite("validatedNumbers", validatedDocumentNumbers);
    }

    private static String performDocumentNumberTests(String documentNumber) {
        return isDocumentNumberFifteenLength(documentNumber) +
                isDocumentNumberStartsDocnumOrContract(documentNumber) +
                isDocumentContainsSpecialCharacters(documentNumber) +
                isDocumentNumberContainsDigits(documentNumber) +
                isDocumentNumberContainsLetters(documentNumber);
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

    private static String isDocumentContainsSpecialCharacters(String documentNumber) {
        if (!(documentNumber.matches(SPECIAL_SYMBOLS_REGEX))) {
            return DOCUMENT_NUMBER_CONTAINS_SPECIAL_SYMBOLS + ". ";
        } else {
            return "";
        }
    }

    private static String isDocumentNumberContainsDigits(String documentNumber) {
        if (!(documentNumber.matches(DIGITS_REGEX))) {
            return DOCUMENT_NUMBER_NOT_CONTAINS_DIGITS + ". ";
        } else {
            return "";
        }
    }

    private static String isDocumentNumberContainsLetters(String documentNumber) {
        if (!(documentNumber.matches(LETTERS_REGES))) {
            return DOCUMENT_NUMBER_NOT_CONTAINS_LETTERS + ". ";
        } else {
            return "";
        }
    }
}
