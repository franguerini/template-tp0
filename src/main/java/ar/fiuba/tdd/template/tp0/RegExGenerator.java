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

    private String generateString(String regEx) {
        String  string = "";
        int afterPos=0;
        for(int i=0;i<regEx.length();){
            RegExChar charType = characterType(regEx.charAt(i));
            charType.generateSubString(regEx,i);
            string = string + charType.getGeneratedString();
            i=charType.getNewPosition();
        }
        return string;
    }

    private RegExChar characterType(char c) {
        if(c=='\\') return new Literal();
        if(c=='.') return new Dot();
        if(c=='*') return new Asterisk();
        if(c=='+') return new Plus();
        if(c=='?') return new QuestionMark();
        if(c=='[') return new Bracket();
        return new Letter();
    }
}