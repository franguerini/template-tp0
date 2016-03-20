package ar.fiuba.tdd.template.tp0;

import org.junit.Test;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class RegExGeneratorTest {

    private boolean validate(String regEx, int numberOfResults) {
        RegExGenerator generator = new RegExGenerator(20);
        List<String> results = generator.generate(regEx, numberOfResults);
        Pattern pattern = Pattern.compile("^" + regEx + "$");
        return results
                .stream()
                .reduce(true,
                    (acc, item) -> {
                        Matcher matcher = pattern.matcher(item);
                        return acc && matcher.find();
                    },
                    (item1, item2) -> item1 && item2);
    }


    @Test
    public void testAnyCharacter() {
        assertTrue(validate(".", 1));
    }

    @Test
    public void testMultipleCharacters() {
        assertTrue(validate("...", 1));
    }

    @Test
    public void testMultipleCharactersAndPlus() {
        assertTrue(validate("...+..", 1));
    }

    @Test
    public void testMultipleCharactersAndPlusAtEnd() {
        assertTrue(validate("...+", 1));
    }

    @Test
    public void testLiteral() {
        assertTrue(validate("\\@", 1));
    }

    @Test
    public void testLiteralDotCharacter() {
        assertTrue(validate("\\@..", 1));
    }

    @Test
    public void testLiteralLeter() {
        assertTrue(validate("f", 1));
    }

    @Test
    public void testLiteralSetOfLetters() {
        assertTrue(validate("AAABBBDDKEsdjlaj1345hfaj", 1));}

    @Test
    public void testLiteralSetOfLettersAndPlus() {
        assertTrue(validate("AAABBB+", 1));}

    @Test
    public void testZeroOrOneCharacter() {
        assertTrue(validate("\\@.h?", 1));}

    @Test
    public void testCharacterSet() {
        assertTrue(validate("[abc]", 1));
    }

    @Test
    public void testThreeCharacterSets() {
        assertTrue(validate("[abc][xdf][qwerty]", 1));
    }

    @Test
    public void testCharacterSetWithQuantifiers() {
        assertTrue(validate("[abc]+", 1));
    }

    @Test
    public void testCharacterSetWithQuantifiersBetweenSets() {
        assertTrue(validate("[abc]+[xcv]*[asdfghjk]?", 1));
    }

    @Test
    public void testAsterikAfterLiteral() {
        assertTrue(validate("AAABc*p8*", 1));
    }

    @Test
    public void testLiteralQuestionmark3options(){
        assertTrue(validate("K?fsdfs?342?",3));
    }
}
