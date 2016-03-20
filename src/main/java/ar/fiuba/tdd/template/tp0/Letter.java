package ar.fiuba.tdd.template.tp0;

import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Letter extends RegExChar {

    public void generateSubString(String regEx, int pos) {
        int repetition = 1;
        if (pos + 1 != regEx.length()) {
            repetition = cuantifier.getRepetition(regEx.charAt(pos + 1));
        }
        for (int repeTimes = 0; repeTimes < repetition ; repeTimes++) {
            generatedString = generatedString + regEx.charAt(pos);
        }
        this.newPosition = pos + 1;
    }
}
