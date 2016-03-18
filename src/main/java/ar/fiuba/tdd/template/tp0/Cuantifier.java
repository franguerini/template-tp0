package ar.fiuba.tdd.template.tp0;

import java.util.Random;

/**
 * Created by gg on 3/18/2016.
 */
public class Cuantifier {
    private static final int MAXREPETITION = 10;

    public int getRepetition(char c) {
        Random rand = new Random();
        if(c=='*'){
          return rand.nextInt(MAXREPETITION);
        }
        if(c=='?'){
            return rand.nextInt(1);
        }
        if(c=='+'){
            return rand.nextInt(MAXREPETITION) + 1;
        }
        return 1;
    }
}
