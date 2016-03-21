package ar.fiuba.tdd.template.tp0;

import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Cuantifier {

    private static final int MAXREPETITION = 10;
    private Random rand = new Random();

    public int getRepetition(String regEx, int pos) {
        if (pos + 1 != regEx.length()) {
            return calculateRepetition(regEx.charAt(pos + 1));
        }
        return 1;
    }

    private int calculateRepetition(char character) {
        if (character == '*') {
            return rand.nextInt(MAXREPETITION);
        }
        if (character == '?') {
            return rand.nextInt(1);
        }
        if (character == '+') {
            return rand.nextInt(MAXREPETITION) + 1;
        }
        return 1;
    }
}
