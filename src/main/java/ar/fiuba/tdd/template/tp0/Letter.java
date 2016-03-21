package ar.fiuba.tdd.template.tp0;

import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Letter extends RegExChar {

    public void generateSubString(String regEx, int pos) {
        repetition = cuantifier.getRepetition(regEx, pos);

        for (int repeTimes = 0; repeTimes < repetition ; repeTimes++) {
            generatedString = generatedString + regEx.charAt(pos);
        }

        newPosition = pos + 1;
    }
}
