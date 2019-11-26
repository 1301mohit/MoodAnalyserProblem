package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSadMoodMessage_RespondSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenAnyMoodMessage_RespondHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

}
