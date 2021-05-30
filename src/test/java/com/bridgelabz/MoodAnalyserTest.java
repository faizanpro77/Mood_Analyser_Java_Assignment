package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMood_whenMessageAnalyse_returnSad() {
      MoodAnalyser moodAnalyser = new MoodAnalyser("Message is sad");
      String mood = moodAnalyser.analyseMood();
      System.out.println(mood);
      Assert.assertEquals("Sad", mood);
    }
}

