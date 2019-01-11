package e3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class KeywordFinderTest {

    private KeywordFinder finder = new KeywordFinder();

    @Test
    void findElegant() {

        String sentence = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");
        List<String> result = finder.findElegant(sentence);
        Assertions.assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    void findPlayful() {

        String sentence = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        List<String> expected = Arrays.asList("rightful", "powerful", "awful", "colorful");
        List<String> result = finder.findPlayful(sentence);
        Assertions.assertEquals(expected, result);
        System.out.println(result);

    }
}