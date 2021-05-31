package com.bridgelabz;

public class MoodAnalyserException {

    public String analyseMoodException(String message) {
        try {
            String emptyString = message.replaceAll(" ","");
            if(emptyString.length() < 1) {
                throw new InvalidMoodException("invalid empty mood");
            }
            if (message.contains("SAD"))
                return "SAD";
        } catch (NullPointerException ex) {
            throw new InvalidMoodException("invalid null mood");
        }
        return "Happy";
    }
}