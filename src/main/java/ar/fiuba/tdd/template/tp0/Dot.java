package ar.fiuba.tdd.template.tp0;

/**
 * Created by gg on 3/18/2016.
 */
public class Dot extends RegExChar {

    public void generateSubString(String regEx, int pos) {

        this.initialize();
        this.calculateRepetitionNextChar(regEx, pos);

        for (int j = 0 ; j < repetition ; j++) {
            generatedString.append((char) random.nextInt(256));
        }
        this.newPosition = pos + 1;
    }

    protected int assignRepetition() {
        return repetition;
    }


}
