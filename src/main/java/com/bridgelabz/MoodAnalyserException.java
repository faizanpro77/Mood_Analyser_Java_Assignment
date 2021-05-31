package com.bridgelabz;

public class MoodAnalyserException {


    public String analyseMoodException(String message) {
        try {
            if (message.contains("SAD"))
                return "SAD";
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        return "Happy";
    }
}