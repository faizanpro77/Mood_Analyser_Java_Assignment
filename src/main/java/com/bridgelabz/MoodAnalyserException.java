package com.bridgelabz;

public class MoodAnalyserException {

    private String message;
    public MoodAnalyserException(String message) {
        this.message = message;
    }
    public String analyseMoodException() throws InvalidMoodException {
        try {
            if (message.length() == 0)  {
                throw new InvalidMoodException(InvalidMoodException.exceptionType.ENTERED_EMPTY,"invalid empty mood");
            }
            if (message.contains("Sad"))
                return "SAD";
            else
                return "Happy";
        } catch (NullPointerException ex) {
            throw new InvalidMoodException(InvalidMoodException.exceptionType.ENTERED_NULL,"invalid null mood");
        }
    }
}