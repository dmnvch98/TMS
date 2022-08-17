package com.teachmeskills.lesson11.mainTask;

public class DocumentNumberNotEndsWithSubstringException extends Exception{
    public DocumentNumberNotEndsWithSubstringException() {
    }

    public DocumentNumberNotEndsWithSubstringException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
