package ar.fiuba.tdd.template.tp0;

import java.util.Hashtable;

/**
 * Created by gg on 3/20/2016.
 */
public class Identifier {

    private static final Hashtable<Character,RegExChar> hashCharacter = new Hashtable<Character,RegExChar>() {
        {
            put('+', new Plus());
            put('*', new Asterisk());
            put('?', new QuestionMark());
            put('.', new Dot());
            put('\\', new Literal());
            put('[', new Bracket());
        }
    };

    RegExChar characterType(char character) {
        RegExChar regExChar = hashCharacter.get(character);
        if (regExChar == null) {
            return new Letter();
        }
        return regExChar;
    }
}
