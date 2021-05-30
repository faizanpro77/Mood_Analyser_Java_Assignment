package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if(message.contains("Message is sad"))
            return "Sad";
        else
            return "Happy";
    }

    public String analyseMood1(String message) {
        if(message.contains("I am in Sad Mood"))
            return "SAD";
        else
            return  "Happy";
    }

    public String analyseMood2(String message) {
        if(message.contains("I am in Any Mood"))
            return "SAD";
        else
            return  "Happy";
    }
}
