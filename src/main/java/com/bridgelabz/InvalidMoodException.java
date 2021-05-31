package com.bridgelabz;

public class InvalidMoodException extends RuntimeException {

    String message;
    public InvalidMoodException(String message) {
        super(message);
        this.message = message;
    }
}
