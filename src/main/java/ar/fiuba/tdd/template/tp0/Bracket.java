package ar.fiuba.tdd.template.tp0;


import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Bracket extends RegExChar {

    public void generateSubString(String regEx, int pos) {

        String groupString = "";
        int groupPos = 0;

        for (groupPos = pos + 1 ; regEx.charAt(groupPos) != ']' ; groupPos++) {
            groupString = groupString + regEx.charAt(groupPos);
        }

        repetition = cuantifier.getRepetition(regEx, pos);

        for (int repeTimes = 0 ; repeTimes < repetition ; repeTimes++) {
            int randPos = random.nextInt(groupString.length());
            generatedString = generatedString + groupString.charAt(randPos);
        }
        newPosition = groupPos + 1;
    }
}
