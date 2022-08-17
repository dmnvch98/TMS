package com.teachmeskills.lesson11.additionalTask;

public final class Validator {
    private Validator() {
    }

    public static boolean checkLogin(String login) throws WrongLoginException {
        return isLoginNotMoreThenTwentyCharacters(login) && isLoginNotContainsSpace(login);
    }

    public static boolean checkPasswords(String password, String confirmPassword) throws WrongPasswordException {
        return arePasswordTheSame(password, confirmPassword) && isPasswordNotContainsSpace(password)
                && isPasswordMoreNotThenTwentyCharacters(password) && isPasswordContainsNumber(password);
    }

    private static boolean isLoginNotContainsSpace(String value) throws WrongLoginException {
        if (!(value.contains(" "))) {
            return true;
        } else {
            throw new WrongLoginException("Логин содержит пробел.");
        }
    }

    private static boolean isLoginNotMoreThenTwentyCharacters(String value) throws WrongLoginException {
        if (value.length() <= 20) {
            return true;
        } else {
            throw new WrongLoginException("Логин содержит более 20-и символов");
        }
    }

    private static boolean arePasswordTheSame(String password, String confirmPassword) throws WrongPasswordException {
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    private static boolean isPasswordNotContainsSpace(String value) throws WrongPasswordException {
        if (!(value.contains(" "))) {
            return true;
        } else {
            throw new WrongPasswordException("Пароль содержит пробел");
        }
    }

    private static boolean isPasswordMoreNotThenTwentyCharacters(String value) throws WrongPasswordException {
        if (value.length() <= 20) {
            return true;
        } else {
            throw new WrongPasswordException("Пароль содержит более 20-и символов");
        }
    }

    private static boolean isPasswordContainsNumber(String value) throws WrongPasswordException {
        if (value.matches(".*[0-9].*")) {
            return true;
        } else {
            throw new WrongPasswordException("Пароль не содержит цифр");
        }
    }

}

