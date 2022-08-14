package com.teachmeskills.lesson11.mainTask;

public class NoAbcSubstringException extends Exception {
    public NoAbcSubstringException() {
    }

    public NoAbcSubstringException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Нет последовательности abc";
    }
}
