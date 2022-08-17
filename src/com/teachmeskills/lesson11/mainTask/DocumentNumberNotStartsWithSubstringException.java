package com.teachmeskills.lesson11.mainTask;

public class DocumentNumberNotStartsWithSubstringException extends Exception {
    public DocumentNumberNotStartsWithSubstringException() {
    }

    public DocumentNumberNotStartsWithSubstringException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
