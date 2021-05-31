package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserExceptionTest {

    @Test
    public void givenMood_whenNull_returnHappy() {
        MoodAnalyserException moodAnalyserException = new MoodAnalyserException();
        String  mood = moodAnalyserException.analyseMoodException(null);
        System.out.println(mood);
        Assert.assertEquals("Happy", mood);


    }
}

/* @Test
    public void givenMood_whenAnyMood_returnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood2();
        System.out.println(mood);
        Assert.assertEquals("SAD", mood);
    }*/