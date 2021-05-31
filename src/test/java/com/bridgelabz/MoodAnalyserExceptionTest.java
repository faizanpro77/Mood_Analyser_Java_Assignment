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
