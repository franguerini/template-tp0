package ar.fiuba.tdd.template.tp0;

/**
 * Created by gg on 3/18/2016.
 */
abstract public class RegExChar {

    protected String generatedString = "";
    protected int newPosition;
    protected Cuantifier cuantifier = new Cuantifier();

    public abstract void generateSubString(String regEx, int i);

    public int getNewPosition() {
        return newPosition;
    }

    public String getGeneratedString(){
        return generatedString;
    }

}
