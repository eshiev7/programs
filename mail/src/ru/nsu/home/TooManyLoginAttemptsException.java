package ru.nsu.home;

public class TooManyLoginAttemptsException extends Exception {
    public TooManyLoginAttemptsException(String message) {
        super(message);
    }
}
