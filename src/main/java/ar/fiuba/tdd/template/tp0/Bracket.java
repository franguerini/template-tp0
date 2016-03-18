package ar.fiuba.tdd.template.tp0;


import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Bracket extends RegExChar {

    public void generateSubString(String regEx, int i) {
        String groupString = "";
        int j=0;
        for(j=i;j<regEx.length()&&regEx.charAt(j)!=']';j++){
            groupString = groupString + regEx.charAt(j);
        }

        Random random = new Random();
        int randPos = random.nextInt(groupString.length());
        generatedString = "" + groupString.charAt(randPos);
        newPosition = j + 1;
    }
}
