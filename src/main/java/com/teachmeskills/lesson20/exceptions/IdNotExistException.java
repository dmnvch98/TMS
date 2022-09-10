package com.teachmeskills.lesson20.exceptions;

public class IdNotExistException extends Exception {
    public IdNotExistException() {
    }

    public IdNotExistException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "CountryIdNotExistException{" +
                "message='" + super.getMessage() + '\'' +
                '}';
    }
}
