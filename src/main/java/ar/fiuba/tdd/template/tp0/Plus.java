package ar.fiuba.tdd.template.tp0;

/**
 * Created by gg on 3/18/2016.
 */
public class Plus extends RegExChar {

    public Plus() {
        repetition = 1;
    }

    public void generateSubString(String regEx, int pos) {
        this.newPosition = pos + 1;
    }


    protected int assignRepetition(char c) {
        repetition = random.nextInt(MAX_REPETITION - 1) + 1;
        return repetition;
    }
}
