package ar.fiuba.tdd.template.tp0;


import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Bracket extends RegExChar {

    public void generateSubString(String regEx, int i) {
        String groupString = "";
        int repetition = 1;
        int j=0;
        for(j=i+1;regEx.charAt(j)!=']';j++){
            groupString = groupString + regEx.charAt(j);
        }

        if(j+1!=regEx.length()) {
            repetition = cuantifier.getRepetition(regEx.charAt(j + 1));
        }


        Random random = new Random();
        for (int k=0;k<repetition;k++) {
            int randPos = random.nextInt(groupString.length());
            generatedString = generatedString + groupString.charAt(randPos);
        }
        newPosition = j + 1;
    }
}
