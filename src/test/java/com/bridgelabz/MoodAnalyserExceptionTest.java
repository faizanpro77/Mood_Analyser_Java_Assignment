package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserExceptionTest {

    @Test
    public void givenMood_whenNull_shouldThrowInvalidMoodException() {
        MoodAnalyserException moodAnalyserException = new MoodAnalyserException();
        try {
            moodAnalyserException.analyseMoodException(null);
        } catch (InvalidMoodException ex) {
            Assert.assertEquals(InvalidMoodException.class, ex.getClass());
        }
    }

    @Test
    public void givenMood_whenEmpty_shouldThrowInvalidMoodException() {
        MoodAnalyserException moodAnalyserException = new MoodAnalyserException();
        try {
            moodAnalyserException.analyseMoodException(" ");
        } catch (Exception ex) {
            Assert.assertEquals("invalid empty mood", ex.getClass());
        }
    }
}

