package com.bridgelabz;

public class InvalidMoodException extends Throwable {

    enum exceptionType {
        ENTERED_EMPTY, ENTERED_NULL
    }
    exceptionType type;
    public InvalidMoodException(exceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
