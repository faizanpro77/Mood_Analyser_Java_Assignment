package com.bridgelabz;

public class MoodAnalyser {

    private String message;
    public MoodAnalyser(String message) { //constructor
        this.message = message;
    }
    public MoodAnalyser() {

    }

    public String analyseMood() {
        if(message.contains("Message is sad"))
            return "Sad";
        else
            return "Happy";
    }
}
