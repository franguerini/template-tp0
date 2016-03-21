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

        StringBuilder groupString = new StringBuilder();
        int groupPos = 0;
        this.initialize();

        for (groupPos = pos + 1 ; regEx.charAt(groupPos) != ']' ; groupPos++) {
            groupString.append(regEx.charAt(groupPos));
        }

        this.calculateRepetitionNextChar(regEx, pos);
        int randPos = 0;

        for (int repeTimes = 0 ; repeTimes < repetition ; repeTimes++) {
            randPos = random.nextInt(groupString.length());
            generatedString.append(groupString.charAt(randPos));
        }
        newPosition = groupPos + 1;
    }

    protected int assignRepetition() {
        return repetition;
    }
}
