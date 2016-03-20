package ar.fiuba.tdd.template.tp0;

/**
 * Created by gg on 3/18/2016.
 */
public class Dot extends RegExChar {


    public void generateSubString(String regEx, int pos) {
        int repetition = 1;
        if ( pos + 1 != regEx.length()) {
            repetition = cuantifier.getRepetition(regEx.charAt(pos + 1));
        }

        for (int j = 0 ; j < repetition ; j++) {
            generatedString = generatedString + (char) random.nextInt(256);
        }
        this.newPosition = pos + 1;
    }
}
