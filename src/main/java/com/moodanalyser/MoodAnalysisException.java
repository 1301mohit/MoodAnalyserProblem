package com.moodanalyser;

public class MoodAnalysisException extends Exception {

    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY, NO_SUCH_CLASS, NO_SUCH_METHOD
    }

    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type=type;
    }

    public void setType(ExceptionType type) {
        this.type = type;
    }

    public ExceptionType getType() {
        return type;
    }
}
