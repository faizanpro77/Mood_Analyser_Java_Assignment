package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMood_whenMessageAnalyse_returnSad() {
      MoodAnalyser moodAnalyser = new MoodAnalyser("Message is sad");//Object of MoodAnalyser class
      String mood = moodAnalyser.analyseMood();
      System.out.println(mood);
      Assert.assertEquals("SAD", mood);//compares the value of mood with "SAD"
    }
    @Test
    public void givenMood_whenSad_returnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood1();
        System.out.println(mood);
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMood_whenAnyMood_returnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood2();
        System.out.println(mood);
        Assert.assertEquals("SAD", mood);
    }
}

