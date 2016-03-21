package ar.fiuba.tdd.template.tp0;


import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Bracket extends RegExChar {

    public Bracket() {
        repetition = 1;
    }

    public void generateSubString(String regEx, int pos) {

        String groupString = "";
        generatedString = "";
        int groupPos = 0;

        for (groupPos = pos + 1 ; regEx.charAt(groupPos) != ']' ; groupPos++) {
            groupString = groupString + regEx.charAt(groupPos);
        }

        this.calculateRepetitionNextChar(regEx, pos);

        for (int repeTimes = 0 ; repeTimes < repetition ; repeTimes++) {
            int randPos = random.nextInt(groupString.length());
            generatedString = generatedString + groupString.charAt(randPos);
        }
        newPosition = groupPos + 1;
    }

    protected int assignRepetition() {
        return repetition;
    }
}
