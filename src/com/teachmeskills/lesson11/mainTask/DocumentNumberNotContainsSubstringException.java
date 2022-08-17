package com.teachmeskills.lesson11.mainTask;

public class DocumentNumberNotContainsSubstringException extends Exception {
    public DocumentNumberNotContainsSubstringException() {
    }

    public DocumentNumberNotContainsSubstringException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
