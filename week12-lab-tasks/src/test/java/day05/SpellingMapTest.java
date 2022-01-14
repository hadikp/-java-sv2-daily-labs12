package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellingMapTest {

    @Test
    void testNumberOfLetters() {
        SpellingMap spellingMap = new SpellingMap();
        //spellingMap.numberOfLetters("almafabokor");
        spellingMap.numberOfLetters("almafafő");
        System.out.println(spellingMap.getSpellings());
    }

}