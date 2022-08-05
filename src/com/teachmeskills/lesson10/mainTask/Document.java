package com.teachmeskills.lesson10.mainTask;

import static com.teachmeskills.lesson10.Utils.print;

public class Document {
    private String documentNumber;
    private final String DOCUMENT_NUMBER_TEMPLATE = "\\d{4}-[a-zA-Z]{3}-\\d{4}-[a-zA-Z]{3}-\\d[a-zA-Z]\\d[a-zA-Z]";
    private final String INCORRECT_DOCUMENT_NUMBER = "Некорректный номер документа. Будет создан документ без номера";

    public Document(String documentNumber) {
        if (documentNumber.matches(DOCUMENT_NUMBER_TEMPLATE)) {
            this.documentNumber = documentNumber;
        } else {
            print(INCORRECT_DOCUMENT_NUMBER);
        }
    }

    public Document() {
        print(INCORRECT_DOCUMENT_NUMBER);
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
