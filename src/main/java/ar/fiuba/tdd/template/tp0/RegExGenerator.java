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
               for(int i=0;i<numberOfResults;i++){
                   add(generateString(regEx));
               }
            }
        };
    }

    private String generateString(String regEx){
        int regSize = regEx.length();
        int i=0;
        String outString = "";
        for (i=0;i<regSize;){
            RegExChar charType = characterType(regEx.charAt(i));
            charType.generateSubString(regEx,i);
            outString = outString + charType.getGeneratedString();
            i=charType.getNewPosition();
        }
        return outString;
    }

    private RegExChar characterType(char c) {
        if(c=='\\') return new Literal();
        if(c=='.') return new Dot();
        if(c=='[') return new Bracket();
        if(c=='+') return new Plus();
        if(c=='?') return new QuestionMark();
        if(c=='*') return new Asterisk();
        return new Letter();
    }
}