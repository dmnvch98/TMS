package com.teachmeskills.lesson11.mainTask;

public class No555SubstringException extends Exception {
    public No555SubstringException() {
    }

    public No555SubstringException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Нет последовательности 555";
    }
}
