package com.bridgelabz;

import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMood_whenMessageAnalyse_returnSad() {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String mood = moodAnalyser.analyseMood("Message is sad");

    }
}

