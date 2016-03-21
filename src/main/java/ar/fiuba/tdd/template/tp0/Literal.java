package ar.fiuba.tdd.template.tp0;

/**
 * Created by gg on 3/18/2016.
 */
public class Literal extends RegExChar {


    public void generateSubString(String regEx, int pos) {
        this.initialize();
        generatedString.append(regEx.charAt(pos + 1));
        newPosition = pos + 2;
    }

    protected int assignRepetition() {
        return repetition;
    }
}
