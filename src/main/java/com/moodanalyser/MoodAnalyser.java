package com.moodanalyser;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser(){

    }

    public String analyseMood() throws MoodAnalysisException {
        try{
            if(this.message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please enter proper mood message");
            if(this.message.contains("I am in sad mood"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch(NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.getMessage());
        }
    }

    public boolean equals(Object another) {
        if(this.message.equals(((MoodAnalyser)(another)).message))
            return true;
        return false;
    }

}
