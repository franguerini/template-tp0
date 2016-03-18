package ar.fiuba.tdd.template.tp0;

/**
 * Created by gg on 3/18/2016.
 */
public class Literal extends RegExChar{


    public void generateSubString(String regEx, int i) {
        generatedString = "" + regEx.charAt(i+1);
        newPosition = i + 2;
    }
}
