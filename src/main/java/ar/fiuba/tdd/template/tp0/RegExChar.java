package ar.fiuba.tdd.template.tp0;

import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
abstract class RegExChar {

    protected static final int MAX_REPETITION = 10;
    protected String generatedString = "";
    protected int newPosition = 0;
    protected int repetition = 1;
    protected Random random = new Random();

    public abstract void generateSubString(String regEx, int pos);

    public int getNewPosition() {
        return newPosition;
    }

    public void setRepetition(int repetition) {
        this.repetition = repetition;
    }

    public String getGeneratedString() {
        return generatedString;
    }

    public void calculateRepetitionNextChar(String regEx, int pos) {
        if (pos + 1 != regEx.length()) {
            repetition = assignRepetition();
        }
        else {
            repetition = 1;
        }
    }

    protected abstract int assignRepetition();
}
