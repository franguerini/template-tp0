package ar.fiuba.tdd.template.tp0;

import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Dot extends RegExChar {


    public void generateSubString(String regEx, int i) {
        int repetition = 1;
        Random rand = new Random();
        generatedString = "";
        if(i+1!=regEx.length()) {
            repetition = cuantifier.getRepetition(regEx.charAt(i + 1));
        }

        for(int j=0;j<repetition;j++){
            generatedString = generatedString + (char) rand.nextInt(256);
        }
        this.newPosition = i + 1;
    }
}
