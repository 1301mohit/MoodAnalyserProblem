package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMoodAnalyserClass_RespondSadMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMoodAnalyserClass_WhenProper_RespondHappyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in any mood");
        Assert.assertEquals("HAPPY", mood);
    }

}
