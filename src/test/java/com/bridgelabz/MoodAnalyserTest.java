package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMood_whenMessageAnalyse_returnSad() {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String mood = moodAnalyser.analyseMood("Message is sad");
      System.out.println(mood);
      Assert.assertEquals("Sad", mood);
    }

    @Test
    public void givenMood_whenSad_returnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood1("I am in Sad Mood");
        System.out.println(mood);
        Assert.assertEquals("SAD", mood);
    }
}

