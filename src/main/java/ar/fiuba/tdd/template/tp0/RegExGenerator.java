package ar.fiuba.tdd.template.tp0;

import java.util.ArrayList;
import java.util.List;


public class RegExGenerator {

    private int maxLength;

    public RegExGenerator(int maxLength) {
        this.maxLength = maxLength;
    }

    public List<String> generate(String regEx, int numberOfResults) {
        return new ArrayList<String>() {
            {
               for (int cant = 0 ; cant < numberOfResults ; cant++) {
                   add(generateString(regEx));
               }
            }
        };
    }

    private String generateString(String regEx){
        int regSize = regEx.length();
        int pos = 0;
        String outString = "";
        for (pos = 0 ; pos < regSize ; ) {
            RegExChar charType = characterType(regEx.charAt(pos));
            charType.generateSubString(regEx, pos);
            outString = outString + charType.getGeneratedString();
            pos = charType.getNewPosition();
        }
        return outString;
    }

    private RegExChar characterType(char character) {
        if (character == '\\') return new Literal();
        if (character == '.') return new Dot();
        if (character == '[') return new Bracket();
        if (character == '+') return new Plus();
        if (character == '?') return new QuestionMark();
        if (character == '*') return new Asterisk();
        return new Letter();
    }
}