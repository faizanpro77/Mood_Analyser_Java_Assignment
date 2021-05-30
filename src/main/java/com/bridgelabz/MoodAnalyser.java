package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if(message.contains("Message is sad"))
            return "Sad";
        else
            return "Happy";
    }
}
