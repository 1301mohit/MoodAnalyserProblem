package com.moodanalyser;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser(){

    }

    public String analyseMood() {
        if(this.message.contains("I am in sad mood"))
            return "SAD";
        else
            return "HAPPY";
    }
}
