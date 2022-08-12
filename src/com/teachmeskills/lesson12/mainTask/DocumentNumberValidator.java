package com.teachmeskills.lesson12.mainTask;

import java.util.ArrayList;

import static com.teachmeskills.lesson12.Utils.*;

public class DocumentNumberValidator {
    private static final String regexPatternFirst = "^DOCNUM[a-zA-Z0-9]{9}+$";
    private static final String regexPatternSecond = "^CONTRACT[a-zA-Z0-9]{7}+$";
    private static final String VALID_NUMBER = "VALID";
    private static final String INVALID_NUMBER = "INVALID";

    public static void isDocumentNumberValid() {
        ArrayList<String> documentNumbersList = readFileAndReturnValues();
        for (String documentNumber: documentNumbersList) {
            String documentNumberTemp = documentNumber.toUpperCase();
            if (!(documentNumberTemp.matches(regexPatternFirst) || documentNumberTemp.matches(regexPatternSecond))) {
                print(documentNumber + " - " + INVALID_NUMBER);
            } else {
                print(documentNumber + " - " +  VALID_NUMBER);
            }
        }
    }
}
