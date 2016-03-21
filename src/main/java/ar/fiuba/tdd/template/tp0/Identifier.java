package ar.fiuba.tdd.template.tp0;

/**
 * Created by gg on 3/20/2016.
 */
public class Identifier {

    RegExChar characterType(char character) {
        if (character == '\\') {
            return new Literal();
        }
        if (character == '.') {
            return new Dot();
        }
        if (character == '[') {
            return new Bracket();
        }
        if (character == '+') {
            return new Plus();
        }
        if (character == '?') {
            return new QuestionMark();
        }
        if (character == '*') {
            return new Asterisk();
        }
        return new Letter();
    }
}
