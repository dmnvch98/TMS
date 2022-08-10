package com.teachmeskills.lesson11.mainTask;

public class DocumentNumberFormatException extends Exception {
    public DocumentNumberFormatException() {
    }

    public DocumentNumberFormatException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "DocumentNumberFormatException: Номер документа пустой";
    }
}
