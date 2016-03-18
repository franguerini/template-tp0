package ar.fiuba.tdd.template.tp0;

import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Dot extends RegExChar {


    public void generateSubString(String regEx, int i) {
        Cuantifier cuantifier = new Cuantifier();
        int repetition = 1;
        char nextChar = '\0';
        if(i+1<regEx.length()){
            nextChar = regEx.charAt(i+1);
            repetition = cuantifier.getRepetition(nextChar);
        }
        Random rand = new Random();
        for(int j=0;j<repetition;j++){
            generatedString = "" + (char) rand.nextInt(256);
        }
        newPosition = i + 1;

    }
}
