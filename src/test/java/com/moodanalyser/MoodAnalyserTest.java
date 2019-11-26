package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMoodAnalyserClass_RespondSadMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMoodAnalyserClass_WhenProper_RespondHappyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

}
