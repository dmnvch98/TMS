package com.teachmeskills.lesson12.mainTask;

import java.util.ArrayList;

import static com.teachmeskills.lesson12.Utils.*;
import static com.teachmeskills.Utils.print;

public class DocumentNumberValidator {
    public static final String regexPatternFirst = "^DOCNUM[a-zA-Z0-9]{9}+$";
    public static final String regexPatternSecond = "^CONTRACT[a-zA-Z0-9]{7}+$";
    public static final String VALID_NUMBER = "VALID";
    public static final String INVALID_NUMBER = "INVALID";

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
