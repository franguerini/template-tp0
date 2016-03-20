package ar.fiuba.tdd.template.tp0;

import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
abstract class RegExChar {

    protected String generatedString = "";
    protected int newPosition = 0;
    protected Cuantifier cuantifier = new Cuantifier();
    protected Random random = new Random();

    public abstract void generateSubString(String regEx, int pos);

    public int getNewPosition() {
        return newPosition;
    }

    public String getGeneratedString() {
        return generatedString;
    }

}
