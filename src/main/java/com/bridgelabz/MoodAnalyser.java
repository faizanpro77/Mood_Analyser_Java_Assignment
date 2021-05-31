package com.bridgelabz;

public class MoodAnalyser {
    String sad1 = "Message is sad";
    String sad = "I am in Sad Mood";
    String happy = "I am in Happy Mood";
    String check;

    private String message;
    public MoodAnalyser(String message) { //constructor
        this.message = message;
    }
    public MoodAnalyser() {

    }

    public String analyseMood() {
            return check = check(sad1);
    }

    public String analyseMood1() {
        return check = check(sad);
    }

    public String analyseMood2() {
        return check = check(happy);
    }

    public  String check(String message) {
        if(message.contains(message))
            return "SAD";
        else
            return  "Happy";
    }
}

