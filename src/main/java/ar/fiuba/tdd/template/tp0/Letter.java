package ar.fiuba.tdd.template.tp0;

import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Letter extends RegExChar {

    public void generateSubString(String regEx, int pos) {

        this.initialize();
        this.calculateRepetitionNextChar(regEx, pos);
        for (int repeTimes = 0; repeTimes < repetition ; repeTimes++) {
            generatedString.append(regEx.charAt(pos));
        }
        newPosition = pos + 1;
    }

    protected int assignRepetition() {
        return repetition;
    }
}
