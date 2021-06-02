package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserExceptionTest {

    @Test
    public void givenMood_whenNull_shouldThrowInvalidMoodException() {
        MoodAnalyserException moodAnalyserException = new MoodAnalyserException(null);
        try {
            moodAnalyserException.analyseMoodException();
        } catch (InvalidMoodException ex) {
            Assert.assertEquals(InvalidMoodException.class, ex.getClass());
            Assert.assertEquals(InvalidMoodException.exceptionType.ENTERED_NULL, ex.type);
        }
    }

    @Test
    public void givenMood_whenEmpty_shouldThrowInvalidMoodException() {
        MoodAnalyserException moodAnalyserException = new MoodAnalyserException("");
        try {
            moodAnalyserException.analyseMoodException();
        } catch (InvalidMoodException ex) {
            Assert.assertEquals("invalid empty mood", ex.getMessage());
            Assert.assertEquals(InvalidMoodException.exceptionType.ENTERED_EMPTY, ex.type);
        }
    }
}

