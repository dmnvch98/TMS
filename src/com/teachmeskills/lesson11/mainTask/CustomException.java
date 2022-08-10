package com.teachmeskills.lesson11.mainTask;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "CustomException = " + getMessage();
    }
}
