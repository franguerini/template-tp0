package ar.fiuba.tdd.template.tp0;

/**
 * Created by gg on 3/18/2016.
 */
public class QuestionMark extends RegExChar {

    public void generateSubString(String regEx, int pos) {
        this.newPosition = pos + 1;
    }

    protected int assignRepetition() {
        repetition = random.nextInt(1);
        return 0;
    }
}
