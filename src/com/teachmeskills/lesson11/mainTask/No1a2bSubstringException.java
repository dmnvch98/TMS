package com.teachmeskills.lesson11.mainTask;

public class No1a2bSubstringException extends Exception{
    public No1a2bSubstringException() {
    }

    public No1a2bSubstringException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Нет последовательности 1a2b";
    }
}
