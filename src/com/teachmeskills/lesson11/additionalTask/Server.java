package com.teachmeskills.lesson11.additionalTask;

public class Server {
    public static boolean registration(String login, String password, String confirmPassword)  {
        try {
            return Validator.checkLogin(login) && Validator.checkPasswords(password, confirmPassword);
        } catch (WrongPasswordException | WrongLoginException e) {
            e.printStackTrace();
            return false;
        }
    }
}
