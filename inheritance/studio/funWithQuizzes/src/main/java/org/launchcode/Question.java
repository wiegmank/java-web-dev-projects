package org.launchcode;

import java.util.HashMap;

public abstract class Question {
    private final String question;
    private final HashMap<Integer, PossibleAnswer> answerMap = new HashMap<>();
    private int numAnswers = 1;

    public Question(String question, PossibleAnswer[] answerArray) {
        this.question = question;

    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, PossibleAnswer> getAnswerMap() {
        return answerMap;
    }

    public int getNumAnswers() {
        return numAnswers;
    }

    public void setNumAnswers(int numAnswers) {
        this.numAnswers = numAnswers;
    }

    @Override
    public abstract String toString();
    void buildAnswerList(PossibleAnswer[] answerArray) {

    }
}

