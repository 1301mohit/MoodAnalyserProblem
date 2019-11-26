package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSadMoodMessage_RespondSadMood() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenAnyMoodMessage_RespondHappyMood() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMoodMessage_RespondExceptionNullMood()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.getType());
        }
    }

    @Test
    public void  givenEmptyMoodMessage_RespondExceptionEmptyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.getType());
        }
    }

    @Test
    public void givenMoodAnalyserClassName_ShouldReturnMoodAnalyserObject() {
        MoodAnalyser moodAnalyser = null;
        try {
            moodAnalyser = MoodAnalyserFactory.createMoodAnalyse("I am in a Happy Mood", "com.moodanalyser.MoodAnalyser");
        } catch (MoodAnalysisException e) {
        }
        Assert.assertEquals(new MoodAnalyser("I am in a Happy Mood"), moodAnalyser);
    }

    @Test
    public void givenMoodAnalyserClassnameImproper_ShouldReturnException() {
        MoodAnalyser moodAnalyser = null;
        try {
            moodAnalyser = MoodAnalyserFactory.createMoodAnalyse("I am in a Happy Mood", "com.moodanalyser.MoodAnalyzer");
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS, e.getType());
        }
    }

    @Test
    public void givenMoodAnalyserConstructorParameterImproper_ShouldReturnException() {
        MoodAnalyser moodAnalyser = null;
        try {
            moodAnalyser = MoodAnalyserFactory.createMoodAnalyse("I am in a Happy Mood", "com.moodanalyser.MoodAnalyser", "I am in Happy Mood");
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD, e.getType());
        }
    }

}
