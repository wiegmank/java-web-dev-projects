package org.launchcode;

public class PossibleAnswer {

    private final String answerText;
    private final boolean correct;

    public PossibleAnswer(String answerText, boolean correct) {
        this.answerText = answerText;
        this.correct = correct;
    }

    public String getAnswerText() {
        return answerText;
    }

    public boolean isCorrect() {
        return correct;
    }
}

