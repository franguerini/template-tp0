package ar.fiuba.tdd.template.tp0;

import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Cuantifier {
    private static final int MAXREPETITION = 10;

    public int getRepetition(char character) {
        Random rand = new Random();
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
